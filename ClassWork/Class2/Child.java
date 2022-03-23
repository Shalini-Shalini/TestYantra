package com.tyss.project;

public class Child extends Parent {
	int z,m,n,o,p;
Child(int x,int y,int z){
	super(x,y);
	this.z=z;
	System.out.println("Class with 3 arg");
}
Child(int x,int y,int z,int m,int n){
	this(x,y,z);
	this.m=m;
	this.n=n;
	System.out.println("Class with 5 arg");
}
Child(int x,int y,int z,int m,int n,int o,int p){
	this(x,y,z,m,n);
	this.o=o;
	this.p=p;
	System.out.println("Class with 7 arg");
}
}
