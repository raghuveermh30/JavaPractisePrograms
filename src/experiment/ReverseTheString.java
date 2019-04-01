/**
 * 
 */
package experiment;

/**
 * @author raghuveer.mh
 *
 */
public class ReverseTheString {
	
	public void reverseTheString (String str) {
		
		//1. for loop in java
		// 2. Java String split() method
		//3. Java String charAt() method
		
		String words [] = str.split(" ");
	
		String abc = "";
		
		for (int i= 0;i<words.length;i++) {
			
			String word = words[i];
			String revString = "";
			
			for(int j=word.length()-1;j>=0;j--) {
				
				revString = revString + word.charAt(j);
			}
			
			abc = revString ;
			
		}
		
		System.out.println(str);
		System.out.println(abc);
	}
	
	//using string buffer metod
	public void reverseStringBuffer(String s) {
		
		StringBuffer sb = new StringBuffer(s);
		StringBuffer s1 = sb.reverse();
		System.out.println(s1);
	}
	
	//using Iterative method using CharArray() method
	
	public void reverseChar(String str) {
		
	char[] ch=	str.toCharArray();
	
	for(int i=ch.length-1;i>=0; i--) {
		System.out.print(ch[i]);
	}
	}
	
	
	public String reverseTheStringSwap(String str) {
		
		if(str==null||str.isEmpty()) {
			return str;
		}
		char[] ch = str.toCharArray();
		int i =0;
		int j = ch.length-1;
		
		while(i<j) {
			swap(ch, i, j);
			i++;
			j--;
		}
		System.out.println(ch);
		return  new String(ch);
		
	}
	
	public static void swap(char[] str, int i,int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}
	public static void main(String args[]) {
		ReverseTheString rev = new ReverseTheString();
		//rev.reverseTheString("raghu");
		//rev.reverseChar("Raghu");
		//rev.reverseStringBuffer("Raghu");
		rev.reverseTheStringSwap("Raghu");
		
	}

}
