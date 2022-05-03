package maria.nicolaiciuc.g1099.adapter;

import maria.nicolaiciuc.g1099.builder.PostalOffices;

public class TestPatternAdapter {

	public static void main(String[] args) {
		
		BasicAppointmentInterface basicAppt = new BasicAppointment("Maria N", 123456789, "03.05.2022");
		basicAppt.displayDate();
		System.out.println(" ");
		
		FullAppointmentInterface fullAppt = new FullAppointment("Maria Nicolaiciuc", 123456789, "03.05.2022", 10.55f, PostalOffices.PO101);
		fullAppt.displayDate();
		fullAppt.displayHour();
		fullAppt.displayPO();
		
		System.out.println(" ");
		FullAppointmentInterface basicApptAdapted = new BasicAppt2FullApptAdapter(basicAppt);
		basicApptAdapted.displayDate();
		basicApptAdapted.displayHour();
		basicApptAdapted.displayPO();
	}

}
