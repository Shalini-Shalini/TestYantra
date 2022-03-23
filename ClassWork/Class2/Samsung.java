package com.tyss.project;

public class Samsung extends SmartPhone {
	int model;
	int q,t;
	Samsung(int r,int y){
		super(r,y);
	}
	
	public void fold() {
		System.out.println("special function of samsung");
	}
	public void model() {
		System.out.println("M21 model");
	}

}
