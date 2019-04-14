package ocpjp.app;

public class SuperClass {
	public int doIt(String str, Integer... data)throws Exception{
		String signature = "(String, Integer[])";
		System.out.println(str + " " + signature);
		return 1;
		}
}
