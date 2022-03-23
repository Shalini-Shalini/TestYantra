package ex2;
import java.util.*;
public class Menu {
public static void main(String[] args) {
	int num,num2;
	char b;
	Scanner choice=new Scanner(System.in);
	do {
		System.out.println("Choose the Menu options 1.Add 2.Sub");
		int x=choice.nextInt();
		if(x==1 || x==2)
		{
			 num=choice.nextInt();
			 num2=choice.nextInt();
		}
		else {
			break;
		}
		
		switch(x) {
		case 1:System.out.println(num+num2);
		break;
		case 2:System.out.println(num-num2);
		break;
		}
		System.out.println("do you want to continue ");
		 b= (char)choice.next().charAt(0);
		}while(b=='y' || b=='Y');
	}
}

