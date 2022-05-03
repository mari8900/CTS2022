package maria.nicolaiciuc.g1099.decorator;

import java.util.Random;

public class DecoratorAppointmentCuloare extends DecoratorAbstractAppointment {

	public DecoratorAppointmentCuloare(AbstractAppointment appt) {
		super(appt);
		// TODO Auto-generated constructor stub
	}
	
	String[] colorArray = new String[] {"Red", "Yellow", "Green", "Blue", "Purple"};
	Random random = new Random();
	
	@Override
	public void create() {
		this.appt.create();
		// System.out.println(colorArray[random.nextInt(3)]);
		System.out.println(colorArray[2]);
	}
	
	@Override
	public void update() {
		this.appt.update();
		// System.out.println(colorArray[random.nextInt(2)]);
		System.out.println(colorArray[0]);
	}
}
