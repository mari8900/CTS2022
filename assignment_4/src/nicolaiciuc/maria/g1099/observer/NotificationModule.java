package nicolaiciuc.maria.g1099.observer;

import java.util.ArrayList;

import nicolaiciuc.maria.g1099.template.WeatherMonitoringSystem;

public class NotificationModule {
	
	WeatherMonitoringSystem weatherMonitoringSystem;
	ArrayList<WeatherClientInterface> clients = new ArrayList<>();

	public NotificationModule(WeatherMonitoringSystem weatherMonitoringSystem) {
		super();
		this.weatherMonitoringSystem = weatherMonitoringSystem;
	}
	
	public void registerClient(WeatherClientInterface client) {
		this.clients.add(client);
	}
	
	public void unregisterClient(WeatherClientInterface client) {
		this.clients.remove(client);
	}
	
	public void notifyWhenWeatherIsUpdated() {
		for(WeatherClientInterface client: clients) {
			System.out.println("Current weather data - temp: " +
					weatherMonitoringSystem.getTemperature() + ", wind speed: " + 
					weatherMonitoringSystem.getWindSpeed() + ", UV level: " + 
					weatherMonitoringSystem.getUvLevel() + ", ground humidity: " + 
					weatherMonitoringSystem.getGroundHumidity() + ", air humidity: " + 
					weatherMonitoringSystem.getAirHumidity());				
			client.notifyClient();
			System.out.println(" ");
		}
	}
}
