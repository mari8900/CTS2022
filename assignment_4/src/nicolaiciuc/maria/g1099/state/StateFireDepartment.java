package nicolaiciuc.maria.g1099.state;


public class StateFireDepartment implements AlertSystemInterface {

	@Override
	public void sendAlert() {
		System.out.println("Possibility of wildfires, alert local fire department");
	}

}
