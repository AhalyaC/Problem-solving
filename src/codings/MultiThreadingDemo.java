package codings;

//creating thread extending Thread class
public class MultiThreadingDemo extends Thread{

	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().getId() + "IS running");
		}catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

