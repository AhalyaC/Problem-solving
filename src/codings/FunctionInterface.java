package codings;

public interface FunctionInterface {

	int abstractFun(int x);
	default void fun() {
		System.out.println("hi");
	}
}

