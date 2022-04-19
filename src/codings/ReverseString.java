package codings;

//using for loop
public class ReverseString {

	public static void main(String[] args) {
		String str = "ahalya";
		String rev=""; 
		int i=str.length();
		/*
		for(int i = str.length();i>0;--i) {
			System.out.println(str.charAt(i-1));
		}
	}*/
		
		while(i>0) {
			rev=rev+(str.charAt(i-1));
			System.out.println(rev);
			--i;
		}
	}
}
