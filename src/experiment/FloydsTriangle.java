package experiment;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		
		System.out.println("Enter the how may rows for floyds triangle");
		
		Scanner sc = new Scanner(System.in);
		
		int noOfRows = sc.nextInt();
		
		int value = 1;
		
		System.out.println("Floyd's triangle   .");
		
		for(int i=1;i<=noOfRows;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(value+"\t");
				value++;
			}
			System.out.println();
		}
		
		
		

	}

}
