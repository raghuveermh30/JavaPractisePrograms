package OOPS;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(usBank.min_bal);
		
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		//Dynamic polymorphism
		//child class object can reffered by the parent interface reference vars
		
		usBank us =new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
		
		// only and only overriden methods are called
		
		

	}

}
