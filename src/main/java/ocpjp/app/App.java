package ocpjp.app;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//taks1();
		//taks2();	
		//taks3();
		//task4();
		task5();
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
	
	public static void task4() {
		int i = 010;
		int j = 07;
		System.out.println(i);
		System.out.println(j);
	}
	public static void task5() {
	byte b = 6;
	b+=8;
	System.out.println(b);
	//b = b+7;
	System.out.println(b);
	}
}
