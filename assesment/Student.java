package com.java.assesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Student {
	 int id, mark;
	 String name;
	 String course;

	public void setId(int id) {
		this.id = id;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public int getMark() {
		return mark;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	Scanner scan = new Scanner(System.in);
	ArrayList l = new ArrayList();
	ArrayList l1 = new ArrayList();

//	public void AddStudent() {
//		setId(scan.nextInt());
//		setName(scan.next());
//
//		setMark(scan.nextInt());

		//setCourse(scan.next());

//		System.out.println(getId());
//		System.out.println(getName());
//		System.out.println(getMark());
//		System.out.println(getCourse());
////LinkedHashSet<Student> l = new LinkedHashSet<>();
//		l.add(getId());
//		l.add(getName());
//		l.add(getMark());
//		l.add(getCourse());
//		l1.addAll(l);
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", mark=" + mark + ", " + (name != null ? "name=" + name + ", " : "")
				+ (course != null ? "course=" + course : "") + "]";
	}

	public void EditStudent() {
//		System.out.println("edit id");
//		setId(scan.nextInt());
//		System.out.println("edit name");
//		setName(scan.next());
//		System.out.println("edit mark");
//		setMark(scan.nextInt());
//		System.out.println("edit course");
//		setCourse(scan.next());
		Student student1 = new Student();
		ArrayList<Student> l = new ArrayList<Student>();
		System.out.println("Enter the id");
		int ID=scan.nextInt();
		for(int i=0;i<l.size();i++) {
			if(l.get(i).getId()==ID) {
				System.out.println("in");
				id=scan.nextInt();
				name=scan.next();
				mark=scan.nextInt();
				course=scan.next();
				l.get(i).setName(name);
				l.get(i).setId(id);
				l.get(i).setMark(mark);
				l.get(i).setCourse(course);
			}
		}
				
//		for(Student s:l) {
//		if(l.get(id)==id) {
//			student1.id=scan.nextInt();
//			student1.name=scan.next();
//			student1.mark=scan.nextInt();
//			student1.course=scan.next();
//			break;
//		}
		}		
	

//	public void ListOfStudents() {
////Iterator<Student> iterator=l1.iterator();
////	while(iterator.hasNext()) {
////	System.out.println(iterator.next());
////	}
//		System.out.print(l);
//	}
	public void DeleteStudent() {
		
	}
	public void GetStudent() {
		
	}
}
