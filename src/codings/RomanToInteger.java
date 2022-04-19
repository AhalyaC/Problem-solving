package codings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static int romanToInteger(String str) {
		
		Map<Character,Integer> map = new HashMap<>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		
		int result = 0;
		//System.out.println(str.length());
		
		for(int i=0;i<str.length()-1;i++) {
			
			char s = str.charAt(i);
			//System.out.println(str.charAt(i));
			System.out.println(map.get(str.charAt(i)));
		//System.out.println(str.charAt(i+1));
			if(map.get(str.charAt(i)) >= map.get(str.charAt(i+1))) {
				//System.out.println(str.length());
				//System.out.println(map.get(str.charAt(i)));
				result = result+map.get(str.charAt(i));
				//System.out.println(result);
			}
			else {
				result = result-map.get(str.charAt(i));
			}
			
		}
		result=result+map.get(str.charAt(str.length()-1));

		//System.out.println(result);
		return result;
		
	}
		public static void main(String[] args) {
			
			String str = "ILCV";
			int n = romanToInteger(str);
			System.out.println(n);
		}
	
}
