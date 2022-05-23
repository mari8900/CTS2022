package nicolaiciuc.maria.g1099.state;

public class StormState implements AlertSystemInterface {

	@Override
	public void sendAlert() {
		System.out.println("Storm alert");
	}

}
