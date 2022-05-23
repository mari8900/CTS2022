package nicolaiciuc.maria.g1099.state;

import nicolaiciuc.maria.g1099.observer.LocalAlertingSystem;
import nicolaiciuc.maria.g1099.template.WeatherMonitoringSystem;

public class MainState {

	public static void main(String[] args) {
		
		LocalAlertingSystem localAlertingSystem = new LocalAlertingSystem(new WeatherMonitoringSystem(29, 10, 3, 10.7, 20.1));
		localAlertingSystem.sendAlerts();
		
		WeatherMonitoringSystem weatherToTriggerFireAlert = new WeatherMonitoringSystem(41, 35, 3, 10.7, 20.1);
		localAlertingSystem.setWeather(weatherToTriggerFireAlert);
		localAlertingSystem.sendAlerts();
		
		WeatherMonitoringSystem weatherToTriggerStormAlert = new WeatherMonitoringSystem(20, 105, 3, 10.7, 20.1);
		localAlertingSystem.setWeather(weatherToTriggerStormAlert);
		localAlertingSystem.sendAlerts();
	}

}
