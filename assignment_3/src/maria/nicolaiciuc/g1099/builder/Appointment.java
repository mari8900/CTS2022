package maria.nicolaiciuc.g1099.builder;

public class Appointment {
	private String fullName;
	private long trackingNumber;
	private String date;
	private float hour;
	private PostalOffices postalOfficeNumber;
	
	private Appointment() {
		
	}

	private Appointment(String fullName, long trackingNumber, String date, float hour, PostalOffices postalOfficeNumber) {
		super();
		this.fullName = fullName;
		this.trackingNumber = trackingNumber;
		this.date = date;
		this.hour = hour;
		this.postalOfficeNumber = postalOfficeNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public long getTrackingNumber() {
		return trackingNumber;
	}

	public String getDate() {
		return date;
	}

	public float getHour() {
		return hour;
	}

	public PostalOffices getPostalOfficeNumber() {
		return postalOfficeNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Appointment [fullName=");
		builder.append(fullName);
		builder.append(", trackingNumber=");
		builder.append(trackingNumber);
		builder.append(", date=");
		builder.append(date);
		builder.append(", hour=");
		builder.append(hour);
		builder.append(", postalOfficeNumber=");
		builder.append(postalOfficeNumber);
		builder.append("]");
		return builder.toString();
	}

	public static class AppointmentBuilder {
		private Appointment appointment;
		
		public AppointmentBuilder(String fullName, long trackingNumber, String date) {
			this.appointment = new Appointment();
			this.appointment.fullName = fullName;
			this.appointment.trackingNumber = trackingNumber;
			this.appointment.date = date;
		}
		
		public AppointmentBuilder setHour(float hour) {
			this.appointment.hour = hour;
			return this;
		}
		
		public AppointmentBuilder setPostalOffice(PostalOffices pOffice) {
			this.appointment.postalOfficeNumber = pOffice;
			return this;
		}
		
		public Appointment build() {
			return this.appointment;
		}
	}
	
}
