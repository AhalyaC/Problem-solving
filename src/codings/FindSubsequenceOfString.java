package codings;

public class FindSubsequenceOfString {

	public static boolean subSequence(String s1,String s2) {
		
		int i=0;
		int j=0;
		int m = s1.length();
		int n = s2.length();
		while(i<m && j<n) {
			char a = s1.charAt(i);
			char b = s2.charAt(j);
			if(s1.charAt(i) == s2.charAt(j)) {
				i++;
			}
			
			if(s1.length()==i) {
				return true;
			}
			
			j++;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		String s1="ads";
		String s2="agdhjhs";
		boolean result =subSequence(s1, s2);
		System.out.println(result);
	}
}
