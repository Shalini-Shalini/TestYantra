package com.tyss.project;

public class Phone {
	int price;
	int ram;
	String brand;
      Phone(int price,int ram)
       {
    	  price=price;
    	  ram=ram;
    	    }
      Phone(){
    		
  	}
	
	public void call() {
		System.out.println("call");
	}

	public void message(String msg) {
		System.out.println(msg);
	}

	public void radio() {
		System.out.println("song playing");
	}
}