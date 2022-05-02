package maria.nicolaiciuc.g1099.singleton;

public class SharedPreferences {
	private static SharedPreferences sharedPreferences = null;
	
	private String username;
	private String password;
	private boolean lightMode;
	private boolean darkMode;
	
	private SharedPreferences() {
		
	}

	private SharedPreferences(String username, String password, boolean lightMode, boolean darkMode) {
		super();
		this.username = username;
		this.password = password;
		this.lightMode = lightMode;
		this.darkMode = darkMode;
	}

	public static synchronized SharedPreferences getSharedPreferences() {
		if(sharedPreferences == null) {
			sharedPreferences = new SharedPreferences();
		}
		return sharedPreferences;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLightMode() {
		return lightMode;
	}

	public void setLightMode(boolean lightMode) {
		this.lightMode = lightMode;
	}

	public boolean isDarkMode() {
		return darkMode;
	}

	public void setDarkMode(boolean darkMode) {
		this.darkMode = darkMode;
	}
	
	
}
