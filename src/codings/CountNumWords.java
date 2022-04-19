package codings;

public class CountNumWords
{

	public static int count(String word) {
		

		
		if(word==null&&word.isEmpty()) {
			return 0;
		}
		String[] arr = word.split("\\s+");
		System.out.println(arr.length);
		return arr.length;
	}
	public static void main(String[] args) {
		
		String word = "One two       three\n four\tfive ";
		count(word);
		
	}
}
