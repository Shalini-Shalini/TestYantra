package com.te.ESS_portal_app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Leave_Info {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_no;
private int Employee_ID;
private String Leave_Date;
private String Leave_Status;
public int getEmployee_ID() {
	return Employee_ID;
}
public void setEmployee_ID(int employee_ID) {
	Employee_ID = employee_ID;
}
public String getLeave_Date() {
	return Leave_Date;
}
public void setLeave_Date(String leave_Date) {
	Leave_Date = leave_Date;
}
public String getLeave_Status() {
	return Leave_Status;
}
public void setLeave_Status(String leave_Status) {
	Leave_Status = leave_Status;
}
public Leave_Info(int employee_ID, String leave_Date, String leave_Status) {
	super();
	Employee_ID = employee_ID;
	Leave_Date = leave_Date;
	Leave_Status = leave_Status;
}
public Leave_Info() {
	super();
}
@Override
public String toString() {
	return "Leave_Info [Employee_ID=" + Employee_ID + ", Leave_Date=" + Leave_Date + ", Leave_Status=" + Leave_Status
			+ "]";
}

}
