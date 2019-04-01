package experiment;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateWordsAndNumOfOcc {

	
	public static void duplicateWords(String inputString) {
		
		String words [] = inputString.split(" ");
		
		   //Creating one HashMap with words as key and their count as value
		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
		
		//Checking each word
		for(String word : words) {
			
			//whether it is present in wordCount
			
			if(wordsCount.containsKey(word.toLowerCase())) {
				
				//If it is present, incrementing it's count by 1
				wordsCount.put(word.toLowerCase(), wordsCount.get(word.toLowerCase())+1);
			}
			
			else {
				
				//If it is not present, put that word into wordCount with 1 as it's value
				wordsCount.put(word.toLowerCase(),1);
			}
			
			
		}
		
		
		//Extracting all keys of wordCount
		Set<String> wordsInString = wordsCount.keySet();
		
		for(String word : wordsInString) {
			if(wordsCount.get(word)>1) {
				
				System.out.println(word+" "+wordsCount.get(word));
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		duplicateWords("Meena Raghu nitya Meena rohit");
	
	}

}
