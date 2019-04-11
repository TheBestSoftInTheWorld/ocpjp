package ocpjp.app;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		taks1();
		
		
	}
	
	public static void taks1() {
		A a = new B();
		a.printValue();
		System.out.println(a.i);
	}
}
