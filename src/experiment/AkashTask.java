package experiment;

import java.util.HashMap;
import java.util.Set;

public class AkashTask {
	
	
	public static void duplicateChar(String inputString) {
		
		inputString = inputString.replace(" ", "");
		
	 char[] ip = inputString.toCharArray();
	 
	 HashMap<Character, Integer> ch =  new HashMap<Character,Integer>();	
	 
	 	for(Character cha : ip) {
	 		
	 		if(ch.containsKey(cha.charValue())) {
	
	 			ch.put(cha.charValue(), ch.get(cha.charValue())+1);
	 		}
	 		
	 		else {
	 			
	 			ch.put(cha.charValue(),1);
	 			
	 		}
	 	}
	 	
	 	Set<Character> chars = 	ch.keySet();
	 	
	 	for(Character cha : chars) {
	 		
 			System.out.print(cha+""+ch.get(cha));
	 	
	 	}
	 	
	 	
	}

	public static void main(String[] args) {
		duplicateChar("aabbb bb ccccd");
	
	}

}
