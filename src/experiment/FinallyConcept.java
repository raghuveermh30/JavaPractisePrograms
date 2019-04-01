package experiment;

public class FinallyConcept {
	
	public static void main(String args[]) {
		
		//test();
		//test1();
		test2();
		
	}
	
	public static void test() {
		
		try {
			System.out.println("inside try block");
			throw new RuntimeException("test");
		}
		
		catch(Exception e) {
			System.out.println("inside catch block");
		}
		
		finally {
			System.out.println("insode finally block");
		}
	}
	
	public static void test1() {
		try {
			System.out.println("inside try block");
			
		}
		
		
		finally {
			System.out.println("insode finally block");
		}
	}
	
public static void test2() {
	
	int i = 10;
		
		try {
			
			int k = i/0;
		}
		
		catch(ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("dividde by zero");
		}
		
		//NullPoniterException e -- if we give that the control wont come into the catch block and it will throws the exception
		
		finally {
			System.out.println("insode finally block");
		}
	}

}
