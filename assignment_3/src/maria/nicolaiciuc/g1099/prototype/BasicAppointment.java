package maria.nicolaiciuc.g1099.prototype;

public class BasicAppointment {
	
	private String fullName;
	private long trackingNumber;
	private String date;
	
	public BasicAppointment() {
		
	}

	public BasicAppointment(String fullName, long trackingNumber, String date) {
		super();
		this.fullName = fullName;
		this.trackingNumber = trackingNumber;
		this.date = date;
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

	@Override
	public Object clone() {
		BasicAppointment clone = new BasicAppointment();
		clone.fullName = this.fullName;
		clone.trackingNumber = this.trackingNumber;
		clone.date = this.date;
		return clone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BasicAppointment [fullName=");
		builder.append(fullName);
		builder.append(", trackingNumber=");
		builder.append(trackingNumber);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}
	
	
}
