package maria.nicolaiciuc.g1099.proxy;

public class TestPatternProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginInterface loginPostapp = new Login();
		if(loginPostapp.checkCredentials("postappUser", "postappPass")) {
			System.out.println("Welcome to Postapp!");
		}
		
		System.out.println(" ");
		
		loginPostapp = new LoginFilterProxy(3, loginPostapp);
		
		String[] passwords = {"postapp", "1234", "postaRomana", "postappPass", "0000"};
		for(int i = 0; i < 5; i++) {
			if(loginPostapp.checkCredentials("postappUser", passwords[i])) {
				System.out.println("The password is: " + passwords[i]);
			}
		}
	}

}
