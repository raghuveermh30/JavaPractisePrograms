package javaSessions;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj  = new MethodOverloading();
		obj.sum();
		obj.sum(4);
		obj.sum(10,20);
		

	}
// Method overloading : when the method name is same with the diffferent arguments or i/p param with in the same class
	

	public void sum() {
		System.out.println("Zero input parameter");
	}
	
	public void sum(int a) {
		System.out.println("one input paramter");
		System.out.println(a);
	}
	
	public void sum(int a, int b) {
		System.out.println("Two input parameter");
		System.out.println(a+b);
	}
}
