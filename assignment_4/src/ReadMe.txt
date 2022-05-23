exercise 1 :
	Pattern used: TEMPLATE
	classes: AbstractWeatherStation, WeatherMonitoringSystem, LakeMonitoringSystem
	
exercise 2:
	Pattern used: STRATEGY
	classes: DataSenderInterface, WeatherMonitoringSystem, SendDataBySMS, SendDataByRESTServices, 
	SendDataByPublishingOnWebsite
	
exercise 3:
	Pattern used: OBSERVER
	classes: WeatherClientInterface, WeatherMonitoringSystem for the weather reference in NotificationModule,
	MeteoService, LocalAlertingSystem, MobileWeatherApp

exercise 4:
	Pattern used: STATE
	classes: WeatherMonitoringSystem for the weather reference in LocalAlertingSystem, AlertSystemInterface,
	NormalState, StateFireDepartment, StayAtHomeState, StormState, IceCreamDepartmentState