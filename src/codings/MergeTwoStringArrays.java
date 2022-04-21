package codings;

import java.util.Arrays;

public class MergeTwoStringArrays {

	public static void main(String[] args) {
		String[] a =  {"A","B","C"};
		String[] b = {"D","E"};
		//merge(a,b);
		merge2(a,b);
	}

	private static void merge2(String[] a, String[] b) {
		
		int m = a.length;
		int n = b.length;
		String[] c = new String[m+n];
		
		for(int i =0;i<m;i++) {
			c[i]=a[i];
		}
		
		for(int i=0;i<n;i++) {
			c[m+i] = b[i];
		}
		
		
			System.out.println(Arrays.toString(c));
		
		
	}

	//Predefined approach
	private static void merge(String[] a, String[] b) {
		
		int m = a.length;
		int n = b.length;
		
		int o = m+n;
		
		String[] c = new String[o];
		
		System.arraycopy(a, 0, c, 0, m);
		System.arraycopy(b, 0, c, m, n);
		System.out.println(Arrays.toString(c));
	}
	
	//Without using prdefined method
	
}
