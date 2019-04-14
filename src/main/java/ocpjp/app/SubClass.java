package ocpjp.app;

public class SubClass extends SuperClass{
	public int doIt(String str, Integer... data) {
		String signature = "(String, Integer[])";
		System.out.println("Overridden: " + str + " " + signature);
		return 0;
	}
}
