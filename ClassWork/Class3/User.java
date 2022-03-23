package com.tyss.corejava;

public class User {
String name;
long number;
User(String name,long number){
	this.name=name;
	this.number=number;
}
public void call() {
	System.out.println(name+"is calling");
}
public void chat()
{
	System.out.println(name+"is messaging");
}
public void vcall()
{
	System.out.println(name+"is vcalling");
}
}
