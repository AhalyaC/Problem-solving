package codings;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
	
	public static String commonPrefix(String str[],int n) {
		
		for(int i=0;i<n;i++) {
			Map<String,Integer> map = new HashMap<>();
			map.put(str[i], 1);
			
			
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		String str[] = new String[] {"flower","flow","fly"};
		commonPrefix(str, str.length);
	}

}
