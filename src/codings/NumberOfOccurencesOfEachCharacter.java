package codings;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurencesOfEachCharacter {

	public static void main(String[] args) {
		String s = "ahalya";
		 occurencesOfEachCharacter(s);
		
	}

	private static void occurencesOfEachCharacter(String s) {
		
		Map<Character,Integer> map = new HashMap<>();
		int result=0;
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			
			else {
				map.put(s.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +":" + entry.getValue());
		}
		
	}
}
