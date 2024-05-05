package oops_Encapsulation;

public class Browser {
	public void launchBrowser() {
		System.out.println("launch browser");
		checkBrowserVersion();
		checkOSCompatability();
		checkRAMSpace();
		checkUpdatesAvailable();
		System.out.println("browser is launched");
	}
	private void checkBrowserVersion() {
		System.out.println("launch browser version");
	}
	private void checkOSCompatability() {
		System.out.println("launch browser with OSCompatability");
	}
	private void checkRAMSpace() {
		System.out.println("checkRAMSpace");
	}
	private void checkUpdatesAvailable() {
		System.out.println("checkUpdatesAvailable");
	}
	
	//click(button xpath) --> isVisible(button) --> isClickabled(button)-->isHegiht(button)
	//public driver.get(url) --> urlisNull() --> https() --> accessUrl() --format()
	

}
