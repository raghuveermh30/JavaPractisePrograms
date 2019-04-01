package javaSessions;

public class FunctionsInJava {

	// Main method is starting point of the execution
	public static void main(String[] args) {
		
		// Non static Method
		// Func or Methods is just like a factory
		
		FunctionsInJava obj  =  new FunctionsInJava();
		obj.test();
		
		
		int p = obj.pqr();
		System.out.println(p);
		
		String s = obj.qa();
		System.out.println(s);
		
		
	int a =	obj.divison(4, 2);
	System.out.println(a);
		
		
	}
	
	public void test(){ //No input no o/p
		System.out.println("Test Mehod");
	}
	
	public int pqr() { //no i/p some o/p
		System.out.println("Pqr is a method");
		int a =10;
		int b=20;
		int c= 30;
		return c;
		
	}
	
	public String qa() { //no i/p some o/p
		System.out.println("QA Mthod");
		String s = "Selenuim";
		return s;
	}
	
	public int divison(int a , int b) { //some i/p some o/p
		System.out.println("Division method");
		int d= a/b;
		return d;
		
		
	}

}
