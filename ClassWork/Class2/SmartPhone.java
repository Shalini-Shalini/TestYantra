package com.tyss.project;

public class SmartPhone extends Phone {
	int cameracount;
	double camera;
	int q,t;
	SmartPhone(int price,int ram,int cam,int cam2){
		super(price,ram);
		cameracount=cam;
		camera=cam2;
	}
SmartPhone(int price,int ram){
	super(price,ram);
}
	public void play() {
		System.out.println("playing pubg");
	}

	public void selfie() {
		System.out.println("taking pictures");
	}

	
	
      
}
