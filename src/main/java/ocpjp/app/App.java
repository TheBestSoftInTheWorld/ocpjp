package ocpjp.app;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//taks1();
		//taks2();	
		taks3();	
	}
	
	public static void taks1() {
		A a = new B();
		a.printValue();
		System.out.println(a.i);
	}
	
	public static void taks2() {
		Test t = Test.BREAKFAST;
		System.out.println(t.getHour() +":"+t.getMins());
	}
	
	public static void taks3() {
		Q7 a = new Q7();
	}
	
}
