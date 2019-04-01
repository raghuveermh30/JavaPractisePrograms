package experiment;

import java.util.Scanner;

public class NumOfWordsInString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		
		Scanner sc = new Scanner(System.in);
		
		String s =  sc.nextLine();
		
	//	String s1[] = s.trim().split(" ");
		
		String s1[] = s.split(" ");
		
		System.out.println("the number of words in the string is " +s1.length);
		
	}

}
