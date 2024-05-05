package SuperKeyword;

public class Homepage extends WebPage{
	public int speed = 50;
	public Homepage() {
		super(10);// super keyword should be the 1st statement of child class constructor
		System.out.println("HP -- default constructor..");
		
	}
    public Homepage(int i) {
    	super(i+10);
    	System.out.println("HP constructor .." + i);
		
	}
    @Override
    public void pagePanel() {
		System.out.println("Homepage pagepanel");	
	}
    public static void billing() {
		System.out.println("homepage -- billing");
	}
	@Override
	public void calculateTimeOut() {
		super.calculateTimeOut();
		System.out.println("Homepage- calculateTimeout 5");
		super.logo();//we can call normal parent class method either with or without super keyword  
		System.out.println(super.speed);//direct parent
		System.out.println(this.speed);//child
		super.pagePanel();
		
		super.billing();
		WebPage.billing();
		
		Homepage.billing();
		this.billing();//not recommended as it's pointing to child class object
		billing();
		
	}
	//Super:
	//is used to call parent class constructor and it should be the 1st statement
	//super & this can't be together in the constructor
	//is used to access parent class methods & variables
	

}
