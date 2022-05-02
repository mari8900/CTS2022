package maria.nicolaiciuc.g1099.factory;

import maria.nicolaiciuc.g1099.builder.PostalOffices;

public class AppointmentFactory {
	
	public static AppointmentInterface createAppointment(ApptTypes type, String name, long number, String date) {
		AppointmentInterface appointment = null;
		
		switch(type) {
			case basic:
				appointment = new ApptBasic(name, number, date);
				break;
			case basicPlusHour:
				float hour = 15.35f;
				appointment = new ApptWithSpecifiedHour(name, number, date, hour);
				break;
			case basicPlusHourAndPostalOffice:
				float hour1 = 17.23f;
				PostalOffices po = PostalOffices.PO1;
				appointment = new ApptWithAllComponents(name, number, date, hour1, po);
				break;
			default:
				throw new UnsupportedOperationException();
			
		}
		
		return appointment;
	}
}
