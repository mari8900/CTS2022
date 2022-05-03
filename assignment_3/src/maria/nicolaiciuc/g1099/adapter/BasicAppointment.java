package maria.nicolaiciuc.g1099.adapter;

public class BasicAppointment extends BasicAppointmentInterface {
	
	private String name;
	private long trackingNumber;
	private String date;
	
	public BasicAppointment(String name, long trackingNumber, String date) {
		super();
		this.name = name;
		this.trackingNumber = trackingNumber;
		this.date = date;
	}

	@Override
	public void create() {
		System.out.println("Appointment was created for " + name);
	}

	@Override
	public void displayDate() {
		System.out.println("Date of appointment is " + date);
	}
	
	
}
