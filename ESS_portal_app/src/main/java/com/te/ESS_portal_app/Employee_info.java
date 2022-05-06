package com.te.ESS_portal_app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee_info {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int Employee_ID ;
private String Employee_Name;
private String Employee_Type;
private String Email;
private String Password;
public int getEmployee_ID() {
	return Employee_ID;
}
public void setEmployee_ID(int employee_ID) {
	Employee_ID = employee_ID;
}
public String getEmployee_Name() {
	return Employee_Name;
}
public void setEmployee_Name(String employee_Name) {
	Employee_Name = employee_Name;
}
public String getEmployee_Type() {
	return Employee_Type;
}
public void setEmployee_Type(String employee_Type) {
	Employee_Type = employee_Type;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public Employee_info(int employee_ID, String employee_Name, String employee_Type, String email, String password) {
	super();
	Employee_ID = employee_ID;
	Employee_Name = employee_Name;
	Employee_Type = employee_Type;
	Email = email;
	Password = password;
}
public Employee_info() {
	super();
}
@Override
public String toString() {
	return "Employee_info [Employee_ID=" + Employee_ID + ", Employee_Name=" + Employee_Name + ", Employee_Type="
			+ Employee_Type + ", Email=" + Email + ", Password=" + Password + "]";
}


}
