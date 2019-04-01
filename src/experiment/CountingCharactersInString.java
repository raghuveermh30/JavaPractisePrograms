package experiment;

public class CountingCharactersInString {

	public static void main(String[] args) {
		
		String s = "Java again Meena Java";
		
		char c= 'a';
		
		int count =s.length()-s.replace("a", "").length();
		
		System.out.println("Number of occurances of 'a' in "+s+"=" +count);
		
		

	}

}
