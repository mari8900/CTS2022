package maria.nicolaiciuc.g1099.flyweight;

public class FlyweightAppointment implements InterfaceFlyweight {
	
	private String name;
	private long trackingNumber;
	private String date;
	
	public FlyweightAppointment(String name, long trackingNumber, String date) {
		super();
		this.name = name;
		this.trackingNumber = trackingNumber;
		this.date = date;
	}

	@Override
	public void displayDetails(DisplayAppointmentDetails details) {
		System.out.println("Display appointment for: " + name);
		System.out.println("Tracking number is: " + trackingNumber);
		System.out.println("Date of appointment is: " + date);
		System.out.println(String.format("Hour is %f and postal office is %s", details.hour, details.postalOffice));
	}

}
