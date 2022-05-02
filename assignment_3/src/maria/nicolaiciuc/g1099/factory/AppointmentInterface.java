package maria.nicolaiciuc.g1099.factory;

public abstract class AppointmentInterface {
	private String name;
	private long trackingNumber;
	private String date;
	
	public AppointmentInterface() {
		
	}

	public AppointmentInterface(String name, long trackingNumber, String date) {
		super();
		this.name = name;
		this.trackingNumber = trackingNumber;
		this.date = date;
	}
	
	public abstract void print(String message);
	
	public abstract void create();
}
