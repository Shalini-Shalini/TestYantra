package com.te.ESS_portal_app;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Scanner scan = new Scanner(System.in);
		
		Leave_Info info = new Leave_Info();
		int a, id;
		do {
			System.out.println("Press 1 to register employee \nPress 2 to login");
			a = scan.nextInt();
		
			if(a==1) {
				Employee_info employee_info = new Employee_info();
				employee_info.setEmployee_Name(scan.next());
				employee_info.setEmployee_Type(scan.next());
				employee_info.setEmail(scan.next());
				employee_info.setPassword(scan.next());
				manager.persist(employee_info);
				transaction.begin();
				transaction.commit();
			}
			
			if(a==2) {
				System.out.println("Enter the Id to login");
				id = scan.nextInt();
				System.out.println("Enter the password");
				String password = scan.next();
				Employee_info find = manager.find(Employee_info.class, id);
				if (find == null) {
					System.out.println("Enter valid ID");
				} else {
					Query query = manager.createQuery("select Employee_Type from Employee_info where Employee_ID=:i");
					query.setParameter("i", id);
					Object emp = query.getSingleResult();
					System.out.println(emp);
					if (emp.equals("Manager")) {
						System.out
								.println("Press 1 to show all leave request \nPress 2 to Approve/Reject leave request");
						int m = scan.nextInt();
						if(m==1) {
							Query query1 = manager.createQuery("from Leave_Info");
							List<Employee_info> resultList = query1.getResultList();
							System.out.println(resultList);
						}
						if(m==2) {
							Query query2 = manager.createQuery("from Leave_Info");
							List<Leave_Info> list = query2.getResultList();
							for (Leave_Info student : list) {
								if (student.getLeave_Status().equals("pending")) {
									System.out.println(student);
									student.setLeave_Status(scan.next());
								}
								manager.persist(info);
								transaction.begin();
								transaction.commit();
							}
						}
					}
					if (emp.equals("Employee")) {
						System.out.println(
								"Press 1 to show my status of leave requests \nPress 2 to request for a leave");
						int n = scan.nextInt();
						if(n==1) {
							Query query1 = manager.createQuery("from Leave_Info where Employee_ID=:i");
							query1.setParameter("i", id);
							List<Leave_Info> resultList = query1.getResultList();
							for (Leave_Info student : resultList) {
								System.out.println(student);
							}
						}
						if(n==2) {
							System.out.println("Enter ID for leave request");
						    info.setEmployee_ID(scan.nextInt());
						    System.out.println("Enter Leave date");
							info.setLeave_Date(scan.next());
							info.setLeave_Status("pending");
					        manager.persist(info);
							transaction.begin();
							transaction.commit();
						
						}
					}
					
				}
			}
		} while (a == 1 || a == 2);
	}
}
