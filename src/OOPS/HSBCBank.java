package OOPS;

public class HSBCBank implements usBank, BrazilBank{

	// if a class is any implementing the interface then it is mandatory to define/override all the methods in the interface
	
	
	// these 3 methods overriding the us bank interface
	public void debit() {
		System.out.println("HSBC -- debit");
	}


	public void credit() {
		System.out.println("Hsbc -- creadit");
	}

	
	public void transferMoney() {
		System.out.println("HSBC--transfer money");
		
	}

	// these 2 metods have seprate methods
	public void educationLoan() {
		System.out.println("HSBC--education loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC--car loan");
	}


// these method is overriding the brazil bank interface
	public void mutualFund() {
		System.out.println("Brazil Bank -- mutual fund");
		
	}
	

}
