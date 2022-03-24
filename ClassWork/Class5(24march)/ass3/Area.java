package com.java.ass3;

public class Area {
	 void RectangleArea(int l,int b) {
		 System.out.println(l*b);
	 }
	 void SquareArea(int s){
		 System.out.println(s*s);
	 }
	 void CircleArea(int r) {
		System.out.println(3.14*r*r); 
	 }
	 public static void main(String[] args) {
		Area area=new Area();
		area.RectangleArea(5, 2);
		area.SquareArea(5);
		area.CircleArea(1);
	}
}
