package oops_Encapsulation;

public class AppLoginTest {

	public static void main(String[] args) {
		//Reg page: first time
		LoginPage Ip = new LoginPage("sameer", "sameer@123");
		Ip.doLogin(Ip.getUserName());
		Ip.setPassword("sameer@456");
		Ip.doLogin(Ip.getUserName());
		Utility.checkBrowserVersion();
		
				

	}

}
