package OOPS;

public class Test {

	public static void main(String[] args) {
		
		
		// static polymorphism -- compile ploymorhism
		
		BMW obj = new BMW();
		obj.start();
		obj.stop();
		obj.refuel();
		obj.saftey();
		
		System.out.println("***********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("*********");
		
		//Top casting
		//child class object can be reffered by the parent class variable -- dymanic polymor or run time polymorphism
		Car c1 = new BMW(); //Top casting
		c1.start();
		c1.refuel();
		c1.start();
		//only overriden methods can be access through run time
		
		BMW b1 = (BMW)new Car(); //Downcasting is not allowed-- it means we are converting into prent class to child class
	}

}
