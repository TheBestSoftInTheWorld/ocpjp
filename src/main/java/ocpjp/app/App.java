package ocpjp.app;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// taks1();
		// taks2();
		// taks3();
		// task4();
		// task5();
		/*
		 * try { task6(); } catch (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		// task7();
		// task8();

		// task9();
		// task10();
		// task11();
		task12();
	}

	public static void taks1() {
		A a = new B();
		a.printValue();
		System.out.println(a.i);
	}

	public static void taks2() {
		Test t = Test.BREAKFAST;
		System.out.println(t.getHour() + ":" + t.getMins());
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
		b += 8;
		System.out.println(b);
		// b = b+7;
		System.out.println(b);
	}

	public static void task6() throws Exception {
		SuperClass sb = new SubClass();
		sb.doIt("hello", 3);
	}

	public static void task7() {
		for (int i = 2; i < 4; i++) {
			for (int j = 2; j < 4; j++) {
				if (i < j) {
					assert i != j : i;
				}
				assert i == 2;
				System.out.println("i: " + i);

				System.out.println("j: " + j);
			}
		}
	}

	public static void task8() {
		for (int i = 2; i < 4; i++) {
			for (int j = 2; j < 4; j++) {
				assert i != j : i;
				System.out.println("i: " + i);
				System.out.println("j: " + j);
			}
		}
	}

	public static void task9() {
		try {
			File f = new File("a.txt");
		} catch (Exception e) {
		}
	}

	public static void task10() {
		Q21 a1 = new Q21() {
			public void printValue() {
				System.out.println("Q21");
			}
		};
		a1.printValue();
	}

	public static void task11() {
		Q22 a = new Q22();
		Q22.A1 a1 = a.new A1();
		a1.printValue();
	}

	public static void task12() {
		Q23B b = new Q23B();
		Q23C c = new Q23C();
		//newPrint(b);
		//newPrint(c);
	}

	public static void newPrint(Q23 a) {
		a.printValue();
	}
}
