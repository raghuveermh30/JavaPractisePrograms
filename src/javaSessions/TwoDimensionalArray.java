package javaSessions;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int i[][] = new int[3][3];
		
		i[0][0] = 0;
		i[0][1] = 1;
		i[0][2] = 2;
		i[1][0] = 3;
		i[1][1] = 4;
		i[1][2] = 5;
		i[2][1] = 6;
		i[2][2] = 7;
		
		
		for(int row= 0; row<i.length;row++) {
			for(int col=0;col<i.length;col++) {
				System.out.println(i[row][col]);
			}
		}
		
	}

}
