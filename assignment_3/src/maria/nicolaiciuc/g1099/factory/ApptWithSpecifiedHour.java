package maria.nicolaiciuc.g1099.factory;

public class ApptWithSpecifiedHour extends AppointmentInterface {
	
	public static final float DEFAULT_HOUR = 10.35f;
	
	private String fullName;
	private long trackingNumber;
	private String date;
	private float hour;
	
	public ApptWithSpecifiedHour() {
		
	}

	public ApptWithSpecifiedHour(String fullName, long trackingNumber, String date, float hour) {
		super();
		this.fullName = fullName;
		this.trackingNumber = trackingNumber;
		this.date = date;
		this.hour = hour;
	}

	@Override
	public void print(String message) {
		System.out.println(message);
		
	}

	@Override
	public void create() {
		System.out.println("Appointment created succesfully at the specified hour: " + hour);
	}
	
	
}
