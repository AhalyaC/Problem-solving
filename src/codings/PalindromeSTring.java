package codings;

public class PalindromeSTring {

	public static boolean palindromeString(String str) {
		
		String s = str.replaceAll("\\s", "");
		StringBuilder builder = new StringBuilder();
		builder.append(s);
		 
		 String s1 = builder.reverse().toString();
		 System.out.println(s1);
		 if(s.equals(s1)) {
			 System.out.println("String is palindrome");
			 return true;
		 }
		 
		 else {
			 System.out.println("String is not palindrome");
			 return false;
		 }
		
		
	}
	
	public static void main(String[] args) {
		String s1 = "race car";
		palindromeString(s1);
	}
}
