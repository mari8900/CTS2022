package maria.nicolaiciuc.g1099.factory;


public class AppointmentFactory {
	
	public static AppointmentInterface createAppointment(ApptTypes type, String name, long number, String date) {
		AppointmentInterface appointment = null;
		
		switch(type) {
			case basic:
				appointment = new ApptBasic(name, number, date);
				break;
			case basicPlusHour:
				appointment = new ApptWithSpecifiedHour(name, number, date, ApptWithSpecifiedHour.DEFAULT_HOUR);
				break;
			case basicPlusHourAndPostalOffice:
				appointment = new ApptWithAllComponents(name, number, date, ApptWithSpecifiedHour.DEFAULT_HOUR, ApptWithAllComponents.DEFAULT_PO);
				break;
			default:
				throw new UnsupportedOperationException();
			
		}
		
		return appointment;
	}
}
