package nicolaiciuc.maria.g1099.observer;

public class LocalAlertingSystem implements WeatherClientInterface {

	@Override
	public void notifyClient() {
		System.out.println("Local alerting system notified");
	}

}
