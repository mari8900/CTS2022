package nicolaiciuc.maria.g1099.observer;

public class MeteoService implements WeatherClientInterface {

	@Override
	public void notifyClient() {
		System.out.println("Meteo service notified");
	}

}
