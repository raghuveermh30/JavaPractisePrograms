package javaSessions;

public class CallByVal_CallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByVal_CallByRef obj = new CallByVal_CallByRef();
		int x= 10;
		int y = 20;
		obj.sum(x, y); //Call by value or pass by value
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		
		//After swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}

	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	//Call by reference
	public void swap(CallByVal_CallByRef t) {
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q;		//t.q = 60
		t.q = temp;//t.q = 50
		
	}

}
