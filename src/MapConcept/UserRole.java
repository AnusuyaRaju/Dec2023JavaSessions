package MapConcept;

import java.util.HashMap;

import ExceptionHandling.MyException;

public class UserRole {
	
	//SRP - Single Responsibility Principle
	public void dologin(String un, String pwd) {
		System.out.println("user login with: " + un + " - " + pwd);
		
	}
	
	public void doLogin(String role) {
		String crdes = getUserCreds(role);
		String un = crdes.split(":")[0].trim();
		String pwd = crdes.split(":")[1].trim();
		dologin(un, pwd);
		
		
	}
	
	private HashMap<String, String> getUserMap() {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin:admin123");
		userMap.put("seller", "seller:seller@123");
		userMap.put("vendor", "vendor:vendor@1234");
		userMap.put("partner", "partner:partner@12390");
		userMap.put("user", "naveen:naveen@1909");
		return userMap;
		
	}
	
	private String getUserCreds(String role) {
		if(getUserMap().containsKey(role)) {
			return getUserMap().get(role);
		}
		else {
			throw new MyException("ROLE NOT FOUND");
		}
			
	}

	public static void main(String[] args) {
		
		//Amazon - RBAC - Role Based Access Control
		//UM - IAM
		
		String role = "user";
		UserRole app = new UserRole();
//		String creds = app.getUserCreds(role);//admin:admin123
//		System.out.println(creds);
//		
//		String cred[] = creds.split(":");
//		String un = cred[0].trim();
//		String pwd = cred[1].trim();
		app.doLogin(role);
		//app.dologin("sekhar@gmail.com", "skh@123");
		
		

	}

}
