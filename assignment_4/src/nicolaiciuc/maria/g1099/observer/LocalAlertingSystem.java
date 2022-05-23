package nicolaiciuc.maria.g1099.observer;

import nicolaiciuc.maria.g1099.state.AlertSystemInterface;
import nicolaiciuc.maria.g1099.state.IceCreamDepartmentState;
import nicolaiciuc.maria.g1099.state.NormalState;
import nicolaiciuc.maria.g1099.state.StateFireDepartment;
import nicolaiciuc.maria.g1099.state.StayAtHomeState;
import nicolaiciuc.maria.g1099.state.StormState;
import nicolaiciuc.maria.g1099.template.WeatherMonitoringSystem;

public class LocalAlertingSystem implements WeatherClientInterface {
	
	WeatherMonitoringSystem weather;
	AlertSystemInterface currentState = null;
	
	public LocalAlertingSystem() {
		
	}
	
	public LocalAlertingSystem(WeatherMonitoringSystem weather) {
		super();
		this.weather = weather;
		this.currentState = new NormalState();
	}

	private void setCurrentState(AlertSystemInterface currentState) {
		this.currentState = currentState;
	}
	
	public void setWeather(WeatherMonitoringSystem weather) {
		this.weather = weather;
	}

	@Override
	public void notifyClient() {
		System.out.println("Local alerting system notified");
	}
	
	public void sendAlerts() {
		
		if((weather.getAirHumidity() < 30) && (weather.getWindSpeed() > 30) && (weather.getTemperature() > 39)) {
			this.setCurrentState(new StateFireDepartment());
			this.currentState.sendAlert();
		}
		else if(weather.getTemperature() < -15) {
			this.setCurrentState(new StayAtHomeState());
			this.currentState.sendAlert();
		}
		else if(weather.getWindSpeed() > 90) {
			this.setCurrentState(new StormState());
			this.currentState.sendAlert();
		}
		else if((weather.getAirHumidity() < 30) && (weather.getWindSpeed() < 5) && (weather.getTemperature() > 39)) {
			this.setCurrentState(new IceCreamDepartmentState());
			this.currentState.sendAlert();
		}
		else
			this.currentState.sendAlert();
	}

}
