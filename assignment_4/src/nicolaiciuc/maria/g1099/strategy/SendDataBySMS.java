package nicolaiciuc.maria.g1099.strategy;

import nicolaiciuc.maria.g1099.template.WeatherMonitoringSystem;

public class SendDataBySMS implements DataSenderInterface {

	@Override
	public void sendData(WeatherMonitoringSystem weatherMonitoringSystem) {
		System.out.println("Weather data - temp: " + 
				weatherMonitoringSystem.getTemperature() + ", wind speed: " + 
				weatherMonitoringSystem.getWindSpeed() + ", UV level: " + 
				weatherMonitoringSystem.getUvLevel() + ", ground humidity: " + 
				weatherMonitoringSystem.getGroundHumidity() + ", air humidity: " + 
				weatherMonitoringSystem.getAirHumidity() + " - was sent by SMS");
	}

}
