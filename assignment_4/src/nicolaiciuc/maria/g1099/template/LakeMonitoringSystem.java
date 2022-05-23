package nicolaiciuc.maria.g1099.template;

public class LakeMonitoringSystem extends AbstractWeatherStation {

	@Override
	public void connectToSensor() {
		System.out.println("Lake monitoring system has connected to sensor");
	}

	@Override
	public void readSensorData() {
		System.out.println("Lake monitoring system is reading sensor data");
	}

	@Override
	public void storeSensorDataToLocalDb() {
		System.out.println("Lake monitoring system is sending sensor data to database");
	}

	@Override
	public void publishSensorData() {
		System.out.println("Lake monitoring system is publishing sensor data");
	}

}
