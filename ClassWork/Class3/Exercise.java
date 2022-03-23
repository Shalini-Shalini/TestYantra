package com.tyss.corejava;

public class Exercise {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=40;
		System.out.println(a>b && ++c>b);
		System.out.println(a++<b || ++c<b);
		System.out.println(a++<b || ++c<b++);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}

	
}
