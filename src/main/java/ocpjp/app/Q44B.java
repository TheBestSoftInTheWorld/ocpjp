package ocpjp.app;

public class Q44B {
	public synchronized void printName() {
		try {
			System.out.println("printName");
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
		}
	}

	public synchronized void printValue() {
		System.out.println("printValue");
	}
}
