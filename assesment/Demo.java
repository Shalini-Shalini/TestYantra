package com.java.assesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int id, mark;
		String name;
		String course;
		Scanner scan = new Scanner(System.in);
		int a;
		ArrayList<Student> l = new ArrayList<Student>();
		Student student = new Student();
		do {
			System.out.println("Enter the task");
			a = scan.nextInt();

			switch (a) {
			case 1:
				System.out.println("Add Student");
				Student student1 = new Student();
				student1.setId(scan.nextInt());
				student1.setName(scan.next());
				student1.setMark(scan.nextInt());
				student1.setCourse(scan.next());
				l.add(student1);
				break;
			case 2:
				System.out.println("Enter the id");
				int ID = scan.nextInt();
				for (int i = 0; i < l.size(); i++) {
					if (l.get(i).getId() == ID) {
						System.out.println("in");
						id = scan.nextInt();
						name = scan.next();
						mark = scan.nextInt();
						course = scan.next();
						l.get(i).setName(name);
						l.get(i).setId(id);
						l.get(i).setMark(mark);
						l.get(i).setCourse(course);
					}
				}
				break;
			case 3:
				System.out.println("Enter the id");
				int y = scan.nextInt();
				for (int i = 0; i < l.size(); i++) {
					if (l.get(i).getId() == y) {
						l.remove(i);
					}
				}
				break;
			case 4:
				System.out.println("Total List of Students");
				Iterator<Student> iterator = l.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				} // System.out.print(l);

				break;
			case 5:
				System.out.println("Enter the student id to get");
				int x = scan.nextInt();
				for (int i = 0; i < l.size(); i++) {
					if (l.get(i).getId() == x) {
						System.out.println(l.get(i));
					}
				}

				break;
			case 6:
				System.out.println("sort list");
				String sortingorder;
				sortingorder = scan.next();
				SortByName sortByName = new SortByName();
				if (sortingorder.equals("name")) {
					Collections.sort(l, sortByName);
				}
				if (sortingorder.equals("Id")) {
					SortById sortbyid = new SortById();
					Collections.sort(l, sortbyid);
				}
				if (sortingorder.equals("mark")) {
					SortByMarks sortbymarks = new SortByMarks();
					Collections.sort(l, sortbymarks);
				}
				if (sortingorder.equals("course")) {
					Collections.sort(l, new SortByCourse());
				}

			}
		} while (a < 7 && a > 0);
		return ;
	}
}
