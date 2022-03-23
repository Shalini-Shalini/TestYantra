package com.tyss.project;

public class Store {
	public static void main(String[] args) {
		SmartPhone Sp= new SmartPhone(20000,4);
		System.out.println(Sp.camera);
		Phone p=new Phone();
		p.price=1000;
		System.out.println(p.price);
		p.price=1000;
		p.ram=4;
		p.message("gjh");
		System.out.println(p.ram);
		Sp.play();
		//Sp.radio();
		//Sp.call();
		Sp.selfie();
		
		
		
		
		
	}

}
