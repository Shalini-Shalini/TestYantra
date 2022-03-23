package ex2;

public class IfElseStatement {
	public static void main(String[] args) {
		int x = 10;
		int y = 12;
		if (x > y) {
			System.out.println("x is greater");
		} else {
			System.out.println("y is greater");
		}
		// ladder ifelse statements
		x = 500;
		y = 1000;
		int z = 900;
		if (x < y && x < z)
			System.out.println("x is smaller");
		else if (x < y)
			System.out.println("x is smaller than y");
		else if (x < z)
			System.out.println("x is smaller than z");
		else {
			System.out.println("x is largest");
		}

	}

}
