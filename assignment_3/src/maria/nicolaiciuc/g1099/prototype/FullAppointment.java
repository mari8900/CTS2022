package maria.nicolaiciuc.g1099.prototype;

import java.util.ArrayList;


public class FullAppointment {
	
	private String fullName;
	private long trackingNumber;
	private String date;
	private float hour;
	private ArrayList<String> postalOffices = null;
	
	public FullAppointment() {
		
	}

	public FullAppointment(String fullName, long trackingNumber, String date, float hour) {
		super();
		this.fullName = fullName;
		this.trackingNumber = trackingNumber;
		this.date = date;
		this.hour = hour;
		
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(long trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getHour() {
		return hour;
	}

	public void setHour(float hour) {
		this.hour = hour;
	}
	
	public void setPostalOffices(ArrayList<String> po) {
		if(po != null) {
			this.postalOffices = new ArrayList<>();
			for(String s : po) {
				this.postalOffices.add(s);
			}
		}
	}

	@Override
	public Object clone() {
		FullAppointment clone = new FullAppointment();
		clone.fullName = this.fullName;
		clone.trackingNumber = this.trackingNumber;
		clone.date = this.date;
		clone.hour = this.hour;
		clone.postalOffices = (ArrayList<String>) this.postalOffices.clone();
		return clone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FullAppointment [fullName=");
		builder.append(fullName);
		builder.append(", trackingNumber=");
		builder.append(trackingNumber);
		builder.append(", date=");
		builder.append(date);
		builder.append(", hour=");
		builder.append(hour);
		builder.append(", postalOffices=");
		builder.append(postalOffices);
		builder.append("]");
		return builder.toString();
	}
	
	
}
