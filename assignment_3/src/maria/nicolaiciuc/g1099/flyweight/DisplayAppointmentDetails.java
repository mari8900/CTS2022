package maria.nicolaiciuc.g1099.flyweight;

public class DisplayAppointmentDetails {
	
	public static final float DEFAULT_HOUR = 10.35f;
	public static final String DEFAULT_PO = "Oficiul Postal 1";
	
	float hour;
	String postalOffice;
	
	public DisplayAppointmentDetails(float hour, String postalOffice) {
		super();
		this.hour = hour;
		this.postalOffice = postalOffice;
	}
	
}
