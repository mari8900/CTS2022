package maria.nicolaiciuc.g1099.flyweight;

public class TestPatternFlyweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FlyweightAppointment apptBasic = new FlyweightAppointment("basic", 1111111110, "07.05.2022");
//		FlyweightAppointment apptHour = new FlyweightAppointment("appt with hour", 1111111100, "07.05.2022");
//		FlyweightAppointment apptFull = new FlyweightAppointment("full", 1111111000, "07.05.2022");
		
//		apptBasic.displayDetails(new DisplayAppointmentDetails(0, null));
//		System.out.println(" ");
//		apptHour.displayDetails(new DisplayAppointmentDetails(9.25f, null));
//		System.out.println(" ");
//		apptFull.displayDetails(new DisplayAppointmentDetails(12.15f, "Oficiul Postal 24"));
		
		FlyweightAppointment apptFull = (FlyweightAppointment) FlyweightFactory.getAppt(AppointmentTypes.withHourAndPo);
		apptFull.displayDetails(new DisplayAppointmentDetails(10.25f, "Oficiul Postal 12"));
		System.out.println(" ");
		
		FlyweightAppointment apptFull1 = (FlyweightAppointment) FlyweightFactory.getAppt(AppointmentTypes.withHourAndPo);
		apptFull1.displayDetails(new DisplayAppointmentDetails(15.15f, "Oficiul Postal 34"));
		System.out.println(" ");
		
		FlyweightAppointment apptFull2 = (FlyweightAppointment) FlyweightFactory.getAppt(AppointmentTypes.withHourAndPo);
		apptFull2.displayDetails(new DisplayAppointmentDetails(13.45f, "Oficiul Postal 41"));
		System.out.println(" ");
		
		FlyweightAppointment apptBasic = (FlyweightAppointment) FlyweightFactory.getAppt(AppointmentTypes.basic);
		apptBasic.displayDetails(new DisplayAppointmentDetails(0, null));
		System.out.println(" ");
		
		FlyweightAppointment apptBasic1 = (FlyweightAppointment) FlyweightFactory.getAppt(AppointmentTypes.basic);
		apptBasic1.displayDetails(new DisplayAppointmentDetails(0, null));
		System.out.println(" ");
	}

}
