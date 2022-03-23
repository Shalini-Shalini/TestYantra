package com.java.project.abstraction;

public class Owner {
public static void main(String[] args) {
	
	Pet a=new Alpha();
	a.food();
	a.sound();
	Alpha b=(Alpha) a;
	b.play();
}
}
