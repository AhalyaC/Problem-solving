package codings;

public class NumberOfOccurenceOfSubstring {
	
	public static void main(String[] args) {
		String pat = "anu";
		String text = "arunanu";
		int s = occurenceOfString(pat,text);
		System.out.println(s);
	}

	private static int occurenceOfString(String pat, String text) {
		
		int n = text.length();
		int m = pat.length();
		int res = 0;
		int f;
		for(int i=0;i<=n-m;i++) {
			if(text.charAt(i)==pat.charAt(0)) {
			int j;
			for(j=0;j<m;j++) {
				System.out.println(text.charAt(i+j));
				System.out.println(pat.charAt(j));
				if(text.charAt(i+j)!=pat.charAt(j)) {
					break;
				}
				
				
			}
			if(j == m) {
				res++;
				j=0;
			}
			}
		}
		return res;
	}

}
