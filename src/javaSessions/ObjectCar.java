package javaSessions;

public class ObjectCar {

	int mod;
	int wheel;
	
	public static void main(String[] args) {
	
		
		// new Car() --  this is the object of the Car class
		// new Keyword is used to create the object
		//a,b,c ---> Object Reference Varibale/Name
		
		ObjectCar a = new ObjectCar();
		ObjectCar b = new ObjectCar();
		ObjectCar c = new ObjectCar();
		
		
		System.out.println("Befor shifting");
		a.mod = 2015;
		a.wheel = 4;
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		b.mod = 2014;
		b.wheel = 4;
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		c.mod = 2016;
		c.wheel = 4;
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After Shifting");
		
		a=b;
		b=c;
		c=a;
		
		a.mod= 10;
		System.out.println(a.mod);//10
		c.mod = 20;
		System.out.println(a.mod);//20
		
		
	}

}
