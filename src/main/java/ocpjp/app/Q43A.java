package ocpjp.app;

public class Q43A implements Runnable {
	public void run() {
		try {
			for (int i = 0; i < 4; i++) {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
		}
	}

}
