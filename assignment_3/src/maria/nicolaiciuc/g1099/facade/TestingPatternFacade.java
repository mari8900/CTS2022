package maria.nicolaiciuc.g1099.facade;

import java.util.ArrayList;

import maria.nicolaiciuc.g1099.adapter.BasicAppointmentInterface;
import maria.nicolaiciuc.g1099.adapter.BasicAppt2FullApptAdapter;
import maria.nicolaiciuc.g1099.adapter.FullAppointmentInterface;
import maria.nicolaiciuc.g1099.builder.Appointment;
import maria.nicolaiciuc.g1099.builder.PostalOffices;
import maria.nicolaiciuc.g1099.decorator.AbstractAppointment;
import maria.nicolaiciuc.g1099.decorator.DecoratorAppointmentCuloare;
import maria.nicolaiciuc.g1099.factory.AppointmentFactory;
import maria.nicolaiciuc.g1099.factory.AppointmentInterface;
import maria.nicolaiciuc.g1099.factory.ApptTypes;
import maria.nicolaiciuc.g1099.flyweight.AppointmentTypes;
import maria.nicolaiciuc.g1099.flyweight.DisplayAppointmentDetails;
import maria.nicolaiciuc.g1099.flyweight.FlyweightAppointment;
import maria.nicolaiciuc.g1099.flyweight.FlyweightFactory;
import maria.nicolaiciuc.g1099.prototype.BasicAppointment;
import maria.nicolaiciuc.g1099.prototype.FullAppointment;
import maria.nicolaiciuc.g1099.proxy.Login;
import maria.nicolaiciuc.g1099.proxy.LoginFilterProxy;
import maria.nicolaiciuc.g1099.proxy.LoginInterface;
import maria.nicolaiciuc.g1099.singleton.SharedPreferences;

public class TestingPatternFacade {
	
	public static void testSingleton() {
		SharedPreferences s1 = SharedPreferences.getSharedPreferences();
		SharedPreferences s2 = SharedPreferences.getSharedPreferences();
		
		if(s1 == s2) {
			System.out.println("They reference the same object");
		}
	}
	
	public static void testBuilder() {
		Appointment a = new Appointment.AppointmentBuilder("Builder", 123456789, "06.05.2022")
				.setHour(10.55f)
				.setPostalOffice(PostalOffices.PO68)
				.build();
		Appointment b = new Appointment.AppointmentBuilder("Builder", 199999999, "06.05.2022")
				.setHour(10.55f)
				.build();
		Appointment c = new Appointment.AppointmentBuilder("Builder", 123483189, "06.05.2022")
				.build();
		System.out.println(a);
		System.out.println(" ");
		System.out.println(b);
		System.out.println(" ");
		System.out.println(c);
	}
	
	public static void testFactory() {
		AppointmentInterface basic =  AppointmentFactory.createAppointment(ApptTypes.basic, "Factory", 123456789, "06.05.2022");
		AppointmentInterface intermediate =  AppointmentFactory.createAppointment(ApptTypes.basicPlusHour, "Factory", 123456789, "06.05.2022");
		AppointmentInterface full =  AppointmentFactory.createAppointment(ApptTypes.basicPlusHourAndPostalOffice, "Factory", 123456789, "06.05.2022");
		basic.create();
		System.out.println(" ");
		intermediate.create();
		System.out.println(" ");
		full.create();
	}
	
	public static void testPrototype() {
		BasicAppointment basic = new BasicAppointment("Prototype", 123456789, "06.05.2022");
		FullAppointment full = new FullAppointment("Prototype", 123456789, "06.05.2022", 14.45f);
		
		ArrayList<String> postalOffices = new ArrayList<>();
		postalOffices.add("PO1");
		postalOffices.add("PO2");
		postalOffices.add("PO19");
		postalOffices.add("PO21");
		postalOffices.add("PO26");
		postalOffices.add("PO44");
		full.setPostalOffices(postalOffices);
		
		BasicAppointment cloneB = (BasicAppointment) basic.clone();
		FullAppointment cloneF = (FullAppointment) full.clone();
		
		System.out.println("Initial basic appointment: " + basic);
		System.out.println("Initial full appointment: " + full);
		System.out.println(" ");
		System.out.println("Cloned basic appointment: " + cloneB);
		System.out.println("Cloned full appointment: " + cloneF);
	}
	
	public static void testFlyweight() {
		FlyweightAppointment appointment = (FlyweightAppointment) FlyweightFactory.getAppt(AppointmentTypes.withHourAndPo);
		FlyweightAppointment appointment1 = (FlyweightAppointment) FlyweightFactory.getAppt(AppointmentTypes.withHourAndPo);
		FlyweightAppointment appointment2 = (FlyweightAppointment) FlyweightFactory.getAppt(AppointmentTypes.withHourAndPo);
		FlyweightAppointment appointment3 = (FlyweightAppointment) FlyweightFactory.getAppt(AppointmentTypes.withHourAndPo);
		
		appointment.displayDetails(new DisplayAppointmentDetails(10.15f, "PO1"));
		appointment1.displayDetails(new DisplayAppointmentDetails(11.11f, "PO11"));
		appointment2.displayDetails(new DisplayAppointmentDetails(16.45f, "PO91"));
		appointment3.displayDetails(new DisplayAppointmentDetails(18.30f, "PO100"));
	}
	
	public static void testAdapter() {
		BasicAppointmentInterface basicAppt = new maria.nicolaiciuc.g1099.adapter.BasicAppointment("Maria N", 123456789, "03.05.2022");
		basicAppt.displayDate();
		System.out.println(" ");
		
		FullAppointmentInterface fullAppt = new maria.nicolaiciuc.g1099.adapter.FullAppointment("Maria Nicolaiciuc", 123456789, "03.05.2022", 10.55f, PostalOffices.PO101);
		fullAppt.displayDate();
		fullAppt.displayHour();
		fullAppt.displayPO();
		
		System.out.println(" ");
		FullAppointmentInterface basicApptAdapted = new BasicAppt2FullApptAdapter(basicAppt);
		basicApptAdapted.displayDate();
		basicApptAdapted.displayHour();
		basicApptAdapted.displayPO();
	}
	
	public static void testDecorator() {
		AbstractAppointment appointment = new maria.nicolaiciuc.g1099.decorator.Appointment("Maria N", 123456789);
		appointment.create();
		appointment.display();
		appointment.update();
		System.out.println(" ");
		
		AbstractAppointment appointmentDecorated = new DecoratorAppointmentCuloare(appointment);
		appointmentDecorated.create();
		appointmentDecorated.update();
	}
	
	public static void testProxy() {
		LoginInterface loginPostapp = new Login();
		if(loginPostapp.checkCredentials("postappUser", "postappPass")) {
			System.out.println("Welcome to Postapp!");
		}
		
		System.out.println(" ");
		
		loginPostapp = new LoginFilterProxy(3, loginPostapp);
		
		String[] passwords = {"postapp", "1234", "postaRomana", "postappPass"};
		for(int i = 0; i < 4; i++) {
			if(loginPostapp.checkCredentials("postappUser", passwords[i])) {
				System.out.println("The password is: " + passwords[i]);
			}
		}
	}
}
