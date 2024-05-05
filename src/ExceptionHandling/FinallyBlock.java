package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("hello");
		
		//finally block always written with try catch block
		//can we write try block without catch yes - we introduced finally block 
		//always go with try catch n finally maintain sequence here
		//finally block can be written only once
		
		
		try {
		int i = 9/0;
		System.out.println("selenium");
		}
		catch (ArithmeticException e) {
			System.out.println("some exp is coming...");
		}
		finally {
			System.out.println("i am in finally block");
		}
		
		//when to use finally block..? Java db connection with finally block.?
		
		//make the connection with DB(SQL): username/pwd
		//hit the SQL: select * from Employee;
		
		//exp is not a matter whether it's coming or not finally block is mandatory to close the DB after getting the results from db
	
		//use try catch block for getting exp
		//get the result from DB/table
		//finally block
		
		//close the DB
		//use the results in script
		
		//continue code
		//logout
		
		
		//file system
		
		//final finally{} finalize()
		

	}

}
