package maria.nicolaiciuc.g1099.factory;

public class TestPatternFactory {

	public static void main(String[] args) {
		
		AppointmentInterface apptBasic = AppointmentFactory.createAppointment(ApptTypes.basic, "Programare 1", 1012345678, "10.05.2022"); 
		AppointmentInterface apptWithHour = AppointmentFactory.createAppointment(ApptTypes.basicPlusHour, "Programare 2", 111111111, "11.05.2022");
		AppointmentInterface apptWithPO = AppointmentFactory.createAppointment(ApptTypes.basicPlusHourAndPostalOffice, "Programare 3", 22222222, "12.05.2022");
		
		apptBasic.create();
		apptWithHour.create();
		apptWithPO.create();
	}

}
