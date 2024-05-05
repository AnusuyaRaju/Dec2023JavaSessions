package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {
	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
//		try {
//			Thread.sleep(5000);//CE -- checked Exception
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
//		try {
//			FileInputStream file = new FileInputStream("users/test.xml");//CE -- checked Exception
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		}

		
		
		try {
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.name = "Naveen";//NPE -- unchecked Exception
			
			//int i = 9 / 0;//AE
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");
		} 
		catch (ArithmeticException e) {
			System.out.println("arithmeticexception is coming...");
			e.printStackTrace();// gives complete info of exception

		}
		catch (NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();// gives complete info of exception

		}
//		catch (Exception e) {
//			System.out.println("exception is coming...");
//			e.printStackTrace();// gives complete info of exception
//
//		}

		System.out.println("bye!");

	}

}
