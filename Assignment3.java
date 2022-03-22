package com.java.project;

import java.util.Scanner;
public class Assignment3 {
	 static void Expression(int x,int y,int z)
	{
		 double res=x;
		for(int i=0;i<z;i++)
		{
			int g=(int)Math.pow(2,i)*y;
			res=res+g;
			System.out.println(res);
		}
		
	}
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int x=a.nextInt();
		int y=a.nextInt();
		int z=a.nextInt();
		Expression(x,y,z);
	}
	

}

