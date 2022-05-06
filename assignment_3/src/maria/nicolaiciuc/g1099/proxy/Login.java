package maria.nicolaiciuc.g1099.proxy;

public class Login implements LoginInterface {

	@Override
	public boolean checkCredentials(String user, String pass) {
		System.out.println("Connecting to Firebase server....");
		System.out.println("Checking user and pass....");
		if(user.equals("postappUser") && pass.equals("postappPass")) {
			return true;
		}
		else 
			return false;
	}

}
