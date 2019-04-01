package experiment;


public class StringTasks {


	public static void main(String[] args) {
	
		String inputString = "vowvowvowvow";
		
		String s = inputString.replace("vow", "x");
		//System.out.println(s);
		
		System.out.println("the num of time vow has repeted " +s.length());
		
		
		System.out.println("***************************");
		
		mixedletters();
	
		
	}

	
	public static void mixedletters() {
		
		String inputString = "abcabcabcaaabc";
		 
		 String s = inputString.replace("abc", "x");
		 System.out.println(s);
		 
		String s1 = s.replace("x", "");
		System.out.println(s1);
		
			int count = s.length()-s1.length();
			
			System.out.println(count);
		
	}
}
