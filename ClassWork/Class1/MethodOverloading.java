package ex2;

public class MethodOverloading {
	
	static int add(int x,int y)
	{
		int sum=x+y;
		System.out.println(sum);
		return sum;
	}
	static void add(int x,int y,int z)
	{
		System.out.println("same name;different no of arguments");
	}
	static void add(int x,double y)
	{
		System.out.println("same name;different types of arguments");
	}
	static void add(double x,int y)
	{
		System.out.println("same name;differnt sequential order should b different for different type of arguments");
	}
public static void main(String[] args) {
	MethodOverloading.add(6, 7, 6);
}
}
