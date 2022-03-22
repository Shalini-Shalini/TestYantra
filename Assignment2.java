package com.java.project;

import java.util.Scanner;

public class Assignment2 {
public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int y =n.nextInt();
		int i=1;
while(i<=10)
{
	int z=i*y;
	System.out.println(y+"*"+i+"="+z);
	i++;
}
}
}

