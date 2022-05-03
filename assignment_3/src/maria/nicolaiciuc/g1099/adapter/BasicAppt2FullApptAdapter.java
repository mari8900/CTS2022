package maria.nicolaiciuc.g1099.adapter;

public class BasicAppt2FullApptAdapter extends FullAppointmentInterface {
	
	BasicAppointmentInterface basicAppt;

	public BasicAppt2FullApptAdapter(BasicAppointmentInterface basicAppt) {
		super();
		this.basicAppt = basicAppt;
	}

	@Override
	public void create() {
		this.basicAppt.create();
	}

	@Override
	public void displayDate() {
		this.basicAppt.displayDate();
		
	}

	@Override
	public void displayHour() {
		System.out.println("Appointment has no preferred hour");
		
	}

	@Override
	public void displayPO() {
		System.out.println("Appointment has no preferred postal office");
	}
	
	
}
