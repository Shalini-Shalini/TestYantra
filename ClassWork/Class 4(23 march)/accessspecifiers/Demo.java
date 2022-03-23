package com.java.project.accessspecifiers;

public class Demo {
public static void main(String[] args) {
	Test t=new Test();
	System.out.println(t.x);
	System.out.println(t.z);
	System.out.println(t.a);
	t.m2();
	t.m3();
	
}
}
