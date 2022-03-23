package ex2;

public class Variables {
	static int a = 9;// static variable
	int b = 10;// instence variable

	public static void main(String[] args) {
		int c = 8;// local variable
		System.out.println(Variables.a);
		Variables t = new Variables();// Variables- is a class name which is non primitive datatype & t is a variable

		System.out.println(t.b);

		// Decision making statements
		int d = 10;
		if (c < d) {
			System.out.println("condition is true");
		}
	}

}
