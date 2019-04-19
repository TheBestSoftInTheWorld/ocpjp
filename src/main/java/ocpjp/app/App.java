package ocpjp.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		// task12();
		// task13();
		// task14();
		// task15();
		// task16();
		// task17();
		// task18();
		// task19();
		// task20();
		// task21();
		// task22();
		// task23();
		// task24();
		// task25();
		// task26();
		// task27();
		// task28();
		// task29();
		// task30();
		// task31();
		// task32();
		// task33();
		// task34();
		//task35();
		task36();
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
		newPrint(b);
		newPrint(c);
	}

	public static void newPrint(Q23 a) {
		a.printValue();
	}

	public static void task13() {
		Q25A a = new Q25B();
		a.getOBJ();
	}

	public static void task14() {
		Q26B b = new Q26B();
		b.printName();
	}

	public static void task15() {
		new Q28B(5);
	}

	public static void task16() {
		new Q1B();
	}

	public static void task17() {
		new Q2B().print();
	}

	public static void task18() {
		Q31A b = new Q31B();
		Q31B b1 = new Q31B();
		b1.test2();
		((Q31B) b).test2();

	}

	public static void task19() {
		Month m1 = Month.JAN;
		Month m2 = Month.JAN;
		Month m3 = Month.FEB;
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1 == m3);
		System.out.println(m1.equals(m3));
	}

	public static void task20() {
		int a = 5, b = 6, c = 7;
		System.out.println("Value is " + b + c);
		System.out.println(a + b + c);
		System.out.println("String " + (b + c));
	}

	public static void task21() {
		Q36B b = new Q36B();
		try {
			ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("datafile"));
			save.writeObject(b);
			save.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ObjectInputStream restore = new ObjectInputStream(new FileInputStream("datafile"));
			Q36B z = (Q36B) restore.readObject();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void task22() {
		Integer i = 34;
		Integer j = 3;
		Integer k = new Integer(9);
		Integer kk = 9;
		Integer kkk = 9;
		int l = 34;
		int m = 9;
		System.out.println(kk == kkk);
		System.out.println(k == kk);
		System.out.println(m == k);
		System.out.println(k.equals(m));
		System.out.println(k.equals(kk));
		System.out.println(l == j);
		System.out.println(l == i);
		System.out.println(i.equals(l));
	}

	public static void task23() {
		File file = new File("test.txt");
		System.out.println(file.exists());
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.exists());
	}

	public static void task24() {
		Q40B b = new Q40B();
		try {
			FileOutputStream fs = new FileOutputStream("b.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(b);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void task25() {
		Q41Test t = new Q41Test();
		t.run();
		t.start();
	}

	public static void task26() {
		Q42A a = new Q42A();
		Thread t = new Thread(a);
		t.start();
		// t.start();
	}

	public static void task27() {
		Q43A a = new Q43A();
		Thread t = new Thread(a, "A1");
		Thread t1 = new Thread(a, "B1");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();

	}

	public static void task28() {
		Q44Test t = new Q44Test();
		Thread t1 = new Thread(t, "t1");
		Thread t2 = new Thread(t, "t2");
		t1.start();
		t2.start();
	}

	public static void task29() {
		Q46A a = new Q46A();
		a.start();

		synchronized (a) {
			System.out.println("waiting");
			try {
				a.wait();
			} catch (InterruptedException e) {

			}
			System.out.println(a.count);
		}

	}

	public static void task30() {
		Queue q = new LinkedList();
		q.add("newyork");
		q.add("ca");
		q.add("texas");
		show(q);

	}

	public static void show(Queue q) {
		q.add(new Integer(11));
		while (!q.isEmpty())
			System.out.print(q.poll() + " ");
	}

	public static void task31() {
		TreeSet s1 = new TreeSet();
		s1.add("one");
		s1.add("two");
		s1.add("three");
		s1.add("one");
		java.util.Iterator it = s1.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	public static void task32() {
		Set s = new TreeSet();
		s.add("7");
		s.add(9 + "");
		java.util.Iterator itr = s.iterator();

		while (itr.hasNext()) {

			System.out.print(itr.next() + " ");
		}
	}

	public static void task33() {
		TreeSet s1 = new TreeSet();
		s1.add("one");
		s1.add("two");
		s1.add("three");
		s1.add("one1");
		s1.add("one");
		java.util.Iterator it = s1.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

	public static void task34() {
		int i = 5;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(++i + i++);
	}

	public static void task35() {
		Integer i = 20;
		String str = (i < 21) ? "jan" : (i < 56) ? "feb" : "march";
		System.out.println(str);
	}
	
	public static void task36() {
		Pattern p = Pattern.compile("a+b?c*");
		Matcher m = p.matcher("ab");
		boolean b = m.matches();
		System.out.println(b);
		Matcher m2 = p.matcher("ac");
		boolean b2 = m2.matches();
		System.out.println(b2);
		Matcher m3 = p.matcher("acc");
		boolean b3 = m3.matches();
		System.out.println(b3);
		Matcher m4 = p.matcher("acb");
		boolean b4 = m3.matches();
		System.out.println(b4);
		Matcher m5 = p.matcher("abc");
		boolean b5 = m5.matches();
		System.out.println(b5);
	}
}
