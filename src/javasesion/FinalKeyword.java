package javasesion;

public class FinalKeyword {
	final int num = 20;//class variable
	public static void main(String[] args) {
		final int i = 10;//local variable
		System.out.println(i);
		
		FinalKeyword obj = new FinalKeyword();
		System.out.println(obj.num);
		
		//Constant variable
		final int DAYS_IN_WEEk = 7;
		int salary = 100*DAYS_IN_WEEk;
		System.out.println(salary);
		
	}

}
