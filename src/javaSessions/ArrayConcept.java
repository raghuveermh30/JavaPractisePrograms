package javaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		
		
		//1. Integer Array
		//Lowest bound = 0, Upper bound =n-1 ,  n is the size of the array
		
		int i[] =  new int[4];
		i[0] = 10;
		i[1] =20;
		i[2] = 30;
		i[3] = 40;
		
		
		System.out.println(i.length); // size of the array
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//2.Double Array
		
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.66;
		
		System.out.println(d[2]);
		
		for(int k=0;k<d.length;k++) {
			System.out.println(d[k]);
		}
		
		//3. Char arry
		
		//4.String Array
		
		String s[] = new String[4];
		s[0] = "Ragu";
		s[1] ="Tom";
		s[2] = "Peter";
		s[3] ="Cgi";
		
		System.out.println(s.length);
		
		System.out.println(s[1]);
				for(int a = 0;a<s.length;a++) {
					System.out.println(s[a]);
				}
				
		//Object Array -- Object array is used to store the different data type values
				
				Object ob[] = new Object[5];
				ob[0] = "TOm";
				ob[1] = 34;
				ob[2] = "Raghu";
				ob[3] = 34.55;
				ob[4] = "London";
	
				System.out.println("sdsdsdsd" +ob.length);
				System.out.println(ob[4]);
				
				for(int r=0;r<ob.length;r++) {
					System.out.println(ob[r]);
				}
		
				
		
	}

}
