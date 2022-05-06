package maria.nicolaiciuc.g1099.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	
	private static HashMap<AppointmentTypes, InterfaceFlyweight> appointments = new HashMap<>();
	
	public static InterfaceFlyweight getAppt(AppointmentTypes type) {
		
		InterfaceFlyweight model = appointments.get(type);
		if(model == null) {
			
			switch(type) {
			case basic:
				model = new FlyweightAppointment("basic appointment", 1111111111, "06.05.2022");
				break;
			case withHour:
				model = new FlyweightAppointment("selected hour appointment", 1222222222, "06.05.2022");
				break;
			case withHourAndPo:
				model = new FlyweightAppointment("full appointment", 1333333333, "06.05.2022");
				break;
			default:
				throw new UnsupportedOperationException();
			}
			appointments.put(type, model);
		}
		return model;
	}
}
