package maria.nicolaiciuc.g1099.decorator;

public class TestPatternDecorator {

	public static void main(String[] args) {
		
		AbstractAppointment appointment = new Appointment("Maria N", 123456789);
		appointment.create();
		appointment.display();
		appointment.update();
		System.out.println(" ");
		
		AbstractAppointment appointmentDecorated = new DecoratorAppointmentCuloare(appointment);
		appointmentDecorated.create();
		appointmentDecorated.update();
		
	}

}
