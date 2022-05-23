package nicolaiciuc.maria.g1099.template;

import nicolaiciuc.maria.g1099.strategy.DataSenderInterface;

public class WeatherMonitoringSystem extends AbstractWeatherStation {
	
	private double temperature;
	private double windSpeed;
	private int uvLevel;
	private double groundHumidity;
	private double airHumidity;
	
	private DataSenderInterface dataSender = null;
	
	public WeatherMonitoringSystem() {
		super();
	}

	public WeatherMonitoringSystem(double temperature, double windSpeed, int uvLevel, double groundHumidity,
			double airHumidity) {
		super();
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.uvLevel = uvLevel;
		this.groundHumidity = groundHumidity;
		this.airHumidity = airHumidity;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public int getUvLevel() {
		return uvLevel;
	}

	public double getGroundHumidity() {
		return groundHumidity;
	}

	public double getAirHumidity() {
		return airHumidity;
	}

	public void setDataSender(DataSenderInterface dataSender) {
		this.dataSender = dataSender;
	}

	@Override
	public void connectToSensor() {
		System.out.println("Weather monitoring system has connected to sensor");
	}

	@Override
	public void readSensorData() {
		System.out.println("Weather monitoring system is reading sensor data");
	}

	@Override
	public void storeSensorDataToLocalDb() {
		System.out.println("Weather monitoring system is sending sensor data to database");
	}

	@Override
	public void publishSensorData() {
		System.out.println("Weather monitoring system is publishing sensor data");
	}
	
	
	public void sendData() {
		if(this.dataSender != null) {
			this.dataSender.sendData(this);
		}
		else
			throw new UnsupportedOperationException();
	}
}
