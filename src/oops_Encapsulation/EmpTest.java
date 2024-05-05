package oops_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		//Employee e1 = new Employee();
		//e1.setName("Gaurav");
		//e1.setAge(20);
		//e1.setSlaray(1000);
		//e1.setActive(true);
		
		
		System.out.println("-------");
		
		//POST: Registration form
		Employee e1 = new Employee("Gaurav", 20, 1000, true);
		
		//GET: get the user info
		System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSlaray() + " " + e1.isActive());
		
		//PUT: update the info
		e1.setAge(30);
		e1.setSlaray(3000);
		
		//GET: get the user info
		System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSlaray() + " " + e1.isActive());
		
		Employee e2 = new Employee("Shiva", 30);
		System.out.println(e2.getName() + " " + e2.getAge() + " " + e2.getSlaray() + " " + e2.isActive());
		e2.setSlaray(5000);
		e2.setActive(true);
		System.out.println(e2.getName() + " " + e2.getAge() + " " + e2.getSlaray() + " " + e2.isActive());
		
		Browser br = new Browser();
		br.launchBrowser();
		

	}

}
