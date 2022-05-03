package maria.nicolaiciuc.g1099.factory;

import maria.nicolaiciuc.g1099.builder.PostalOffices;

public class ApptWithAllComponents extends AppointmentInterface {
	
	public static final PostalOffices DEFAULT_PO = PostalOffices.PO1;
	
	private String fullName;
	private long trackingNumber;
	private String date;
	private float hour;
	private PostalOffices postalOfficeNumber;
	
	public ApptWithAllComponents() {
		
	}

	public ApptWithAllComponents(String fullName, long trackingNumber, String date, float hour,
			PostalOffices postalOfficeNumber) {
		super();
		this.fullName = fullName;
		this.trackingNumber = trackingNumber;
		this.date = date;
		this.hour = hour;
		this.postalOfficeNumber = postalOfficeNumber;
	}

	@Override
	public void print(String message) {
		System.out.println(message);
	}

	@Override
	public void create() {
		System.out.println("Appointment created successfully at hour: " + hour + " at this specified postal office: " + postalOfficeNumber);
	}
	
}
