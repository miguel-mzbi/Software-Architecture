package creational.singleton;

public class Client {

	public static void main(String[] args) {
		AppPreferences appPref = AppPreferences.getInstance();
		
		appPref.setShareInfo(true);
		System.out.println(appPref.toString());
		//...
		appPref = AppPreferences.getInstance();
		System.out.println(appPref.toString());
	}
}

