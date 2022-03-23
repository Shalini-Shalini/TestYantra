package com.tyss.corejava;

public class Main {
	public static void main(String[] args) {
		
	
User user=new Admin("shalini",123456677l);
user.call();
user.chat();
user.vcall();

Admin admin=(Admin) user;
admin.adduser();
}
}
