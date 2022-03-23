package ex2;
//ctrl+space for shortcut
//ctrl+alt+downarrow
public class Operators {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		//unary operators(operate using one operand)
		System.out.println(a++);
		System.out.println(b++);
		System.out.println(--a);
		System.out.println(b--);
		
		//arithmetic operators
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a*b);
		
		//relational operators
		b=10;
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
	
		//logical operators
		int c=10;
		System.out.println(c>a && ++c>b);
		System.out.println(c>a || c>b);
		
		//bitwise operators
		System.out.println(6 | 8);
				
	}

}

