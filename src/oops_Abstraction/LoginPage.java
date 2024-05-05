package oops_Abstraction;

public class LoginPage extends Page{
	public LoginPage() {
		System.out.println("loginpage -- constructor...");
	}
	public LoginPage(int i) {
		System.out.println("loginpage -- constructor..." + i);
	}

	@Override
	public void title() {
		System.out.println("LP - title");
		
	}

	@Override
	public void url() {
		System.out.println("LP - url");
		
	}
	@Override
	public void pageloadingTime() {
		System.out.println("Login page -- loading Time - 5 secs");
	}
	public void doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " " + pwd);
	}

}
