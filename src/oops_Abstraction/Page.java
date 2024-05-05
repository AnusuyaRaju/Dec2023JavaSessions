package oops_Abstraction;

public abstract class Page {
	public Page() {
		this(20);
		System.out.println("page -- constructoe..");
	}
	public Page(int i) {
		System.out.println("page -- constructor.." + i);
	}
	//we can't create the obj of abstract class
	//we can have abs..methods & non abs methods
	//no default methods are allowed in abs class
	//abs class can have only n only non abs methods also
	//can we create the constructor of abs class..? - yes
	
	
	//no abs methods - 0% abstraction
	//only abs methods - 100% abstraction
	//abs methods + non abs methods - partial abstraction
	//0 to 100% abstraction 
	
	public abstract void title();
	public abstract void url();
	public void pageloadingTime() {
		System.out.println("page -- loading Time - 20 secs");
	}
	public static void displayLogo() {
		System.out.println("page -- display logo");
	}
	public final void footers() {
		System.out.println("page -- footers");
	}
	
}
