package codings;

public class Singleton {

	private static Singleton singleInstatnce=null;
	
	public String s;
	
	private Singleton() {
		 s = "Hello I am a string part of Singleton class";
	}

	public static Singleton Singleton()
    {
        if (singleInstatnce == null)
        	singleInstatnce = new Singleton();
 
        return singleInstatnce;
    }
}
