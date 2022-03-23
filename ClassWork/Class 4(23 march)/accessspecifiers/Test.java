package com.java.project.accessspecifiers;

public class Test {
public int x=10;
private int y=20;
protected int z=30;
int a=100;
private void m1() {
	System.out.println("private");
}
 void m2() {
	System.out.println("default");
}
 protected void m3() {
		System.out.println("protected");
	}
public static void main(String[] args) {
	Test t=new Test();
	System.out.println(t.x);
	System.out.println(t.y);
	System.out.println(t.z);
	System.out.println(t.a);
	t.m1();
	t.m2();
	t.m3();
	
}
}
