package nicolaiciuc.maria.g1099.state;

public class IceCreamDepartmentState implements AlertSystemInterface {

	@Override
	public void sendAlert() {
		System.out.println("Alert the local ice cream department");
	}

}
