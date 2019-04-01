package OOPS;

public interface usBank {
	
	/*properties of Interface
	
	Only method declaration and doesnot have any method body
	no mehod body -- only method prototype
	in interface, we can declare the var, vars are always static in nature
	vars value will not be changed -- vars are final in nature
	no static methods in interface
	no main method in interface
	interface are abstract in nature
	we cannot create the object of interface
	Acieving the Multiple inheritence
	*/
	
	int  min_bal  = 100;
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();
	

}
