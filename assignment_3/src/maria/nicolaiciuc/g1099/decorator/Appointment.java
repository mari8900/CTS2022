package maria.nicolaiciuc.g1099.decorator;

public class Appointment extends AbstractAppointment {
	
	public Appointment(String name, long number) {
		this.name = name;
		this.trackingNumber = number;
	}
	
	@Override
	public void create() {
		System.out.println("Appointment has been created for " + name);
	}

	@Override
	public void display() {
		System.out.println("Tracking number used was " + trackingNumber);
	}

	@Override
	public void update() {
		System.out.println("Appointment was updated");
	}

}
