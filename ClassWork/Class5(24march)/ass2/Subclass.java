package com.java.ass2;

public class Subclass extends Abstract{
	void a_method() {
		System.out.println("This is abstract method");
	}
	public static void main(String[] args) {
		Subclass s=new Subclass();
		s.a_method();
		s.b_method();
	}
}
