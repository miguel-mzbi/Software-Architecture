package creational.singleton;

public class AppPreferences {

	private static AppPreferences uniqueInstance = null;
	private boolean shareInfo;
		
	private AppPreferences() {
		this.shareInfo = false;
	}
	
	public static AppPreferences getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new AppPreferences();
		}
		return uniqueInstance;
	}
	
	public void setShareInfo(boolean value) {
		this.shareInfo = value;
	}
	
	public String toString() {
		return "Application Preferences:\nShare information: " + this.shareInfo; 
	}
}

