package codings;

import java.util.Arrays;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		char[] s = "ahalya".toCharArray();
		//System.out.println(s);
		removeduplicates(s,s.length);
	}

	private static void removeduplicates(char[] s, int n) {
		
		int index =0;
		
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(s[i]==s[j]) {
					break;
				}
			}
			
			if(j == i) {
				s[index++] = s[i];
				System.out.println(s[i]);
				System.out.println(s[index]);
			}
			
			System.out.println(String.valueOf(Arrays.copyOf(s, index)));
		}
		
	}
}
