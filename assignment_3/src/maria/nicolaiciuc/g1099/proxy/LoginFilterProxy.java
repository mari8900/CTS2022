package maria.nicolaiciuc.g1099.proxy;

import java.util.HashMap;

public class LoginFilterProxy implements LoginInterface {
	
	int noAllowedAttempts;
	private LoginInterface login;
	HashMap<String, Integer> loginCounter = new HashMap<>();
	
	public LoginFilterProxy(int noAllowedAttempts, LoginInterface login) {
		super();
		this.noAllowedAttempts = noAllowedAttempts;
		this.login = login;
	}

	@Override
	public boolean checkCredentials(String user, String pass) {
		Integer noAttempts = loginCounter.get(user);
		if(noAttempts == null) {
			loginCounter.put(user, 0);
			noAttempts = 0;
		}
		if(noAttempts >= noAllowedAttempts) {
			System.out.println("Notify user....");
			return false;
		}
		
		boolean isOk = this.login.checkCredentials(user, pass);
		if(!isOk) {
			noAttempts +=1 ;
			loginCounter.put(user, noAttempts);
		}
		return isOk;
	}

}
