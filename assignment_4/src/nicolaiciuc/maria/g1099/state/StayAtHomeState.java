package nicolaiciuc.maria.g1099.state;

public class StayAtHomeState implements AlertSystemInterface {

	@Override
	public void sendAlert() {
		System.out.println("All people should stay at home");
	}

}
