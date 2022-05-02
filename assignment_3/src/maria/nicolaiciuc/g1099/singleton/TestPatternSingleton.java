package maria.nicolaiciuc.g1099.singleton;

public class TestPatternSingleton {

	public static void main(String[] args) {
		SharedPreferences pref1 = SharedPreferences.getSharedPreferences();
		SharedPreferences pref2 = SharedPreferences.getSharedPreferences();
		
		if(pref1 == pref2) {
			System.out.println("The reference is to the same object");
		}

	}

}
