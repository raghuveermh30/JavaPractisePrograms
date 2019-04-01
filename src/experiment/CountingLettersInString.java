package experiment;

import java.util.Scanner;

public class CountingLettersInString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		System.out.println("The total letters in the string " +lettersCount(word));
	}

	
	public static int lettersCount(String s) {
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			if(Character.isWhitespace(s.charAt(i))) {
				
			}
			else {
				count = count+1;
				
			}
			
		}
		return count;
	}
	
	

}
