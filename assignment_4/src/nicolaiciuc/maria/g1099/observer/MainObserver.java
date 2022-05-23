package nicolaiciuc.maria.g1099.observer;

import nicolaiciuc.maria.g1099.template.WeatherMonitoringSystem;

public class MainObserver {
	
	public static void main(String[] args) {
		
		NotificationModule notifModule = new NotificationModule(new WeatherMonitoringSystem("28.5", 4.8, 3, 6.2, 7.1));
		MeteoService meteoService = new MeteoService();
		MobileWeatherApp mobileWeatherApp = new MobileWeatherApp();
		LocalAlertingSystem localAlertingSystem = new LocalAlertingSystem();
		
		notifModule.registerClient(meteoService);
		notifModule.registerClient(mobileWeatherApp);
		notifModule.registerClient(localAlertingSystem);
		
		notifModule.notifyWhenWeatherIsUpdated();
		
		notifModule.unregisterClient(mobileWeatherApp);
		notifModule.notifyWhenWeatherIsUpdated();
	}
}
