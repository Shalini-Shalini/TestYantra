package com.tyss.corejava;

public class Admin extends User {
Admin(String name,long number){
	super(name,number);
}
public void adduser() {
	System.out.println(name+"adding another user");
}
public void removeuser() {
	System.out.println(name+"is removing user");
}
}
