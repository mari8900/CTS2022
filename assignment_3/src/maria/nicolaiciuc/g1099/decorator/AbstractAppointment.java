package maria.nicolaiciuc.g1099.decorator;

public abstract class AbstractAppointment {
	String name;
	long trackingNumber;
	
	public abstract void create();
	public abstract void display();
	public abstract void update();
}
