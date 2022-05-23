package nicolaiciuc.maria.g1099.template;

public class MainTemplate {

	public static void main(String[] args) {
		
		WeatherMonitoringSystem weather = new WeatherMonitoringSystem();
		LakeMonitoringSystem lake = new LakeMonitoringSystem();
		
		weather.collectWeatherData();
		System.out.println(" ");
		lake.collectWeatherData();
	}

}
