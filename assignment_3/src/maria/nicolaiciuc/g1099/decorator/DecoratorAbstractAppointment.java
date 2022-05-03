package maria.nicolaiciuc.g1099.decorator;

public abstract class DecoratorAbstractAppointment extends AbstractAppointment {
	
	protected AbstractAppointment appt;
	
	public DecoratorAbstractAppointment(AbstractAppointment appt) {
		super();
		this.appt = appt;
	}
	
	@Override
	public void create() {
		this.appt.create();
	}

	@Override
	public void display() {
		this.appt.display();
	}

	@Override
	public void update() {
		this.appt.update();
	}
	
}
