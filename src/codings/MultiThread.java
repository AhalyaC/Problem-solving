package codings;

public class MultiThread {

	public static void main(String[] args) {
		int n = 8;
		for(int i =0;i<n;i++) {
			//MultiThreadingDemo demo = new MultiThreadingDemo();
			//demo.start();
			Thread thread = new Thread(new MultiThreadingRunnable());
			thread.start();
		}
	}
}
