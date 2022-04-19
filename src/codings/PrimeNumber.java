package codings;

public class PrimeNumber {

	public static void main(String[] args) {
		int a = 7;
		//boolean r = prime(a);
		listOfprime(a);
		//System.out.println(a);
	}

	private static boolean prime(int a) {
		int i;
		if(a==0||a==1) {
			System.out.println(("Not prime"));
		}
		else 
		{
		for(i=2;i<=a;i++) {
			if(a%i==0) {
			
			System.out.println("Not prime");
			return false;
		}
		else {
			System.out.println("Prime Number");
			return true;
		}
		}
		}
		return false;
		
		
	}
	
	public static int listOfprime(int n) {
		int a;int i;
		for(i=0;i<=n;i++) {
			if((i==0||i==1) && (i%2==0)) {
				System.out.println(i+"is not prime");
			}
			else {
				System.out.println(i);
			}
			
		}
		return n;
		
	}
}
