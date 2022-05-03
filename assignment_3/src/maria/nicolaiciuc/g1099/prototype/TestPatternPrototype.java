package maria.nicolaiciuc.g1099.prototype;

import java.util.ArrayList;

public class TestPatternPrototype {

	public static void main(String[] args) {
		BasicAppointment basicAppt = new BasicAppointment("Maria N", 123456789, "03.05.2022");
		FullAppointment fullAppt = new FullAppointment("Maria N", 123456789, "04.05.2022", 15.25f);
		
		ArrayList<String> postalOffices = new ArrayList<>();
		postalOffices.add("PO1");
		postalOffices.add("PO2");
		postalOffices.add("PO3");
		postalOffices.add("PO4");
		postalOffices.add("PO5");
		
		fullAppt.setPostalOffices(postalOffices);
		
		System.out.println(basicAppt);
		System.out.println(fullAppt);
		System.out.println(" ");
		
		// clones
		BasicAppointment cloneBasic = (BasicAppointment) basicAppt.clone();
		FullAppointment cloneFull = (FullAppointment) fullAppt.clone();
		System.out.println(cloneBasic);
		System.out.println(cloneFull);
		
	}

}
