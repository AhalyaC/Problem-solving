package codings;

public interface NewInterface {

	public static void store() {
		System.out.println("hi");
	}
	
	default void show() {
		System.out.println("hello");
	}
	
	Object shown();
	
}
