package experiment;

import java.util.Scanner;

public class PyramidPatternProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		
		int noOfRows = sc.nextInt();
		
		int rowCount = 1;
		
		System.out.println("the output is like a pyramid structure");
		
	for (int i = noOfRows; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
 
            //Printing 'rowCount' value 'rowCount' times at the end of each row
 
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(rowCount+" ");
            }
 
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }
		
		/*for (int i = noOfRows;i>0;i--) {
			
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=rowCount;j++) {
				System.out.print(rowCount+ " ");
			}
			
			System.out.println();
			
			rowCount++;
		}
		
	}*/
	}
}
