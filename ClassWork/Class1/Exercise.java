package ex2;
//ternary operatorsm
public class Exercise {
   int a=21;
   static int b=12;
   
 public static void main(String[] args) {
	int c=9;
	Exercise e =new Exercise();
	System.out.println(e.a);
	System.out.println(Exercise.b);
	String y;
	y=(Exercise.b<e.a)?"True":"False";
	System.out.println(c);
	
}
}
