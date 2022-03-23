package ex2;

public class MethodCalling {
static float mul(float x,int y)//static is used bcz it can b accessed through class name
{
	float mul=x*y;
	return mul;
}
public static void main(String[] args) {
	float res=MethodCalling.mul(5.2f, 6);//methodcalling is class name;mul is method name
			System.out.println(res);
}
}
