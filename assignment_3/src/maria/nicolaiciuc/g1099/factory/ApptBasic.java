package maria.nicolaiciuc.g1099.factory;

public class ApptBasic extends AppointmentInterface {
	
	private String name;
	private long trackingNumber;
	private String date;
	
	public ApptBasic(String name, long trackingNb, String date) {
		this.name = name;
		this.trackingNumber = trackingNb;
		this.date = date;
	}
	
	@Override
	public void print(String message) {
		System.out.println(message);
		
	}

	@Override
	public void create() {
		System.out.println("Appointment created succesfully");
	}
	
}
