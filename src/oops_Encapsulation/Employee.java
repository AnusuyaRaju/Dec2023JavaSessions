package oops_Encapsulation;

public class Employee {
	private String name;
	private int age;
	private double slaray;
	private boolean isActive;
	
	 public Employee(String name, int age, double slaray, boolean isActive) {
	    this.name = name;
		this.age = age;
		this.slaray = slaray;
		this.isActive = isActive;
	}
	 public Employee(String name, int age) {
		    this.name = name;
			this.age = age;
			
		}
	//public getter/setter:
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSlaray() {
		return slaray;
	}
	public void setSlaray(double slaray) {
		this.slaray = slaray;
	}
	
   
	

	
}
