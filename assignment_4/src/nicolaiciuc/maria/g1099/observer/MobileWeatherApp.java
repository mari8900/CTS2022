package nicolaiciuc.maria.g1099.observer;

public class MobileWeatherApp implements WeatherClientInterface {

	@Override
	public void notifyClient() {
		System.out.println("Mobile weather application notified");
	}

}
