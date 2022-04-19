package codings;

public class SumOfArray {
	
	public static int sum(int[] array) {
		int sum=0;
		int i;
		for(i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a =  {1,2,3,4};
		sum(a);
	}
}
