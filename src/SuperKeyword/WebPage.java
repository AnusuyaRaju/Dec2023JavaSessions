package SuperKeyword;

public class WebPage extends Page{
	//public final int speed = 10;
	public WebPage() {
		System.out.println("WP -- default constructor..");
		
	}
    public WebPage(int i) {
    	System.out.println("WP constructor .." + i);
		
	}
	public void calculateTimeOut() {
		System.out.println("Webpage- calculateTimeout 20");
	}
	public final void logo() {
		System.out.println("Webpage - logo");
	}
	public static void billing() {
		System.out.println("webpage -- billing");
	}

}
