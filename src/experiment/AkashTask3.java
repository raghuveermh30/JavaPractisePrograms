package experiment;

public class AkashTask3 {

	public static void main(String[] args) {
		
		
		swapSubStrings("maths25science23");
	}
	
public static void swapSubStrings(String inputString) {
	
	inputString = inputString.replace(" ", "");
		System.out.println(inputString);
		
		System.out.println("***********");
		
		String s =inputString.substring(0, 5);
		String s1 = inputString.substring(5, 7);
		String s2 = inputString.substring(7, 14);
		String s3 = inputString.substring(14);
		//String s1 = "VOWOVOWOVOW"; VOW
		s = s+s2;
		
		s2 = s.substring(0,(s.length()-s2.length()));
		int	p =s.length()-s2.length();
		//System.out.println("lenght of the string is "+p);
		//System.out.println("the value of s2 becomes " +s2);
		s = s.substring(s2.length());
		//System.out.println("the value of s "+s);
		System.out.print(s+s1+s2+s3);
		
	}
}
