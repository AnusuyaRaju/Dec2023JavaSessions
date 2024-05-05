package ExceptionHandling;

public class MyException extends RuntimeException{
	public MyException (String mesg) {
		super(mesg);//purpose of super keyword is to call the parent class constructor(RunTimeExp)we want all the exp should be thrown at runtime
		
	}
	

	

}
