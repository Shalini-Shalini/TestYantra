package com.java.ass;

public class Student {
	String name1;
	String name2;
	String name3;
	String name4;

	Student() {
		System.out.println("Unknown");
		}

	public Student(String name1, String name2, String name3, String name4) {
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
	}

}
