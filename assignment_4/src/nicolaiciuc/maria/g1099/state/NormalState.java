package nicolaiciuc.maria.g1099.state;


public class NormalState implements AlertSystemInterface {

	@Override
	public void sendAlert() {
		System.out.println("Weather conditions normal, no alerts");		
	}

}
