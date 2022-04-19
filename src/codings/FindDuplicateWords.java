package codings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWords {
	
	public static void main(String[] args) {
		String expression = "I and I";
		
		String[] words = expression.split("\\W");
		//System.out.println(arr.toString());
		
		Map<String,Integer> map = new HashMap<>();
		
		for(String word:words) {
			
			if(map.get(word) != null) {
				map.put(word, map.get(word)+1);
			}
			
			else {
				map.put(word, 1);
			}
		}
		
		Set<String> set = map.keySet();
		
		for(String w : set) {
			if(map.get(w)>1) {
			System.out.println(w);
		}
		}
			
	}

}
