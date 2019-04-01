package experiment;

public class AkashTask2{
	
	public static void TotalSum(String inputString) {
		
		String s =inputString.substring(0, 5);
		System.out.println(s);
		String s1 = inputString.substring(5, 7);
		System.out.println(s1);
		String s2 = inputString.substring(7, 14);
		System.out.println(s2);
		String s3 = inputString.substring(14);
		System.out.println(s3);
		
		System.out.println("************");
		
		int i = Integer.parseInt(s1);
		System.out.println(i);
		int i1 = Integer.parseInt(s3);
		System.out.println(i1);
		
		System.out.println("the total sum is " +(i1+i));
		
		/*String inputString1=inputString.replace(s2, s);
		inputString1.replace(s, s2);
		
		System.out.println(inputString1);*/	
		
		
	}
	
	public static void swapSubStrings(String inputString) {
		
		System.out.println("**************");
		String s =inputString.substring(0, 5);
		System.out.println(s);
		String s1 = inputString.substring(5, 7);
		System.out.println(s1);
		String s2 = inputString.substring(7, 14);
		System.out.println(s2);
		String s3 = inputString.substring(14);
		System.out.println(s3);
		
		
		s = s+s2;
		s2 = s.substring(0,(s.length()-s2.length()));
		s = s.substring(s2.length());
		System.out.println(s);
		System.out.print(s+s1+s2+s3);
		
	}


	
	public static void main(String[] args) {
	
		TotalSum("maths25science23");
		swapSubStrings("maths25science23");
	}

}
