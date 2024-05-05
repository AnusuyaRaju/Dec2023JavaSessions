package oops_Abstraction;

public class AppTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.pageloadingTime();
		lp.doLogin("admin", "admin");
		Page.displayLogo();//static method can be called by child class as well as parent name class
		lp.footers(); //Can't override final so we can inherit by reference name
		
		System.out.println("---------");
		
		//top casting:
		//child class object can be referred by parent abstract class ref variable...
		
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.pageloadingTime();
		pg.footers();
		
		//down casting:Not available/recommended
		
		
		
		
		

	}

}
