package ocpjp.app;

public class Q44Test extends Thread {
	Q44B b = new Q44B();

	public void run() {
		if (Thread.currentThread().getName().equals("t1")) {
			b.printName();
		} else {
			b.printValue();
		}
	}
}
