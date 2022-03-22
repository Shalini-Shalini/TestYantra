package com.java.project;
import java.util.*;
public class Assignment {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int y=n.nextInt();
		System.out.println("even numbers are");
		int i;
		for(i=0;i<=y;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Odd numbers are");
		for(i=0;i<=y;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
	
}

