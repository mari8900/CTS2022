package maria.nicolaiciuc.g1099.adapter;

import maria.nicolaiciuc.g1099.builder.PostalOffices;

public class FullAppointment extends FullAppointmentInterface {
	
	private String name;
	private long trackingNumber;
	private String date;
	private float hour;
	private PostalOffices po;
	
	public FullAppointment(String name, long trackingNumber, String date, float hour, PostalOffices po) {
		super();
		this.name = name;
		this.trackingNumber = trackingNumber;
		this.date = date;
		this.hour = hour;
		this.po = po;
	}
	
	@Override
	public void create() {
		System.out.println("Appointment was created for " + name);
	}
	
	@Override
	public void displayDate() {
		System.out.println("Date of appointment is " + date);
	}
	
	@Override
	public void displayHour() {
		System.out.println("Hour of appointment is " + hour);
	}
	
	@Override
	public void displayPO() {
		System.out.println("Selected postal office is " + po);
	}
}
