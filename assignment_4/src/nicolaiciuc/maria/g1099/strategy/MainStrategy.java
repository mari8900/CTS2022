package nicolaiciuc.maria.g1099.strategy;

import nicolaiciuc.maria.g1099.template.WeatherMonitoringSystem;

public class MainStrategy {

	public static void main(String[] args) {
		
		WeatherMonitoringSystem weatherMonitoringSystem = new WeatherMonitoringSystem("33.2", 5.6, 4, 2.3, 3.3);
		weatherMonitoringSystem.setDataSender(new SendDataBySMS());
		weatherMonitoringSystem.sendData();
		System.out.println(" ");
		
		weatherMonitoringSystem.setDataSender(new SendDataByRESTServices());
		weatherMonitoringSystem.sendData();
		System.out.println(" ");
		
		weatherMonitoringSystem.setDataSender(new SendDataByPublishingOnWebsite());
		weatherMonitoringSystem.sendData();
	}

}
