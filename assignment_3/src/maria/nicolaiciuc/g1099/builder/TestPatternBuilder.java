package maria.nicolaiciuc.g1099.builder;

public class TestPatternBuilder {

	public static void main(String[] args) {
//		Appointment appt1 = new Appointment("Nicolaiciuc Maria", 1109763421, "02.05.2022", 18.35f, PostalOffices.PO101);
//		System.out.println(appt1);
		
		Appointment appt2 = new Appointment.AppointmentBuilder("Nicolaiciuc Maria", 1109763421, "02.05.2022")
				.setHour(10.55f)
				.build();
		Appointment appt3 = new Appointment.AppointmentBuilder("Nicolaiciuc Dan", 1438753472, "05.05.2022")
				.setHour(11.25f)
				.setPostalOffice(PostalOffices.PO45)
				.build();
		
		System.out.println(appt2);
		System.out.println(appt3);
	}

}
