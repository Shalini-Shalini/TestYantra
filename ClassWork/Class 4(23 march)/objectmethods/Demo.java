package com.java.project.objectmethods;

import java.util.LinkedList;

public class Demo {
	public String toString() {
		return "0";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LinkedList<?>) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("This is from finalise");
	}
	
public static void main(String[] args) {
	Demo a=new Demo();
	Demo demo=new Demo();
	System.out.println(a);
	Demo demo2=new Demo();
	System.out.println("This is object 2 of demo"+demo2);
	boolean equals = demo2.equals(demo);
	System.out.println(equals);
	a=null;
	
	Demo demo3 = new Demo();
	int hashCode=demo3.hashCode();
	System.out.println(hashCode);
	demo2=null;
	demo3=null;
	System.gc();
}
}
