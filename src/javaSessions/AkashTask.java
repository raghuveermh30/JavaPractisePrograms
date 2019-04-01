package javaSessions;

import java.util.HashMap;
import java.util.Set;

public class AkashTask {
	
	
	public static void duplicateChar(String inputString) {
		
		inputString = inputString.replace(" ", "");
		
	 char[] c = inputString.toCharArray();
	 
	 HashMap<Character, Integer> map =  new HashMap<Character,Integer>();	
	 
	 	for(char ch : c) {
	 		
	 		if(map.containsKey(ch)) {
	 			map.put(ch, map.get(ch)+1);
	 		}
	 		else {
	 			map.put(ch, 1);
	 		}
	 	}
	 	
	 	Set<Character> st = 	map.keySet();
	 	
	 	for(char ch : st) {
	 		
 			System.out.print(ch+""+map.get(ch));
	 	
	 	}
	 	
	 	
	}

	public static void main(String[] args) {
		duplicateChar("aab   bbccccd");
	
	}

}
