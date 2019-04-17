package ocpjp.app;

public class Q25B extends Q25A {
	public Q25D getOBJ() {
		System.out.println("class Q25B - return Q25D");
		return new Q25D();
	}
}
