package nicolaiciuc.maria.g1099.template;

public abstract class AbstractWeatherStation {
	
	public abstract void connectToSensor();
	public abstract void readSensorData();
	public abstract void storeSensorDataToLocalDb();
	public abstract void publishSensorData();
	
	public final void collectWeatherData() {
		connectToSensor();
		readSensorData();
		storeSensorDataToLocalDb();
		publishSensorData();
	}
}
