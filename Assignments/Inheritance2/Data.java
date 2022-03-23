package ex2;

public class Data {
public static void main(String[] args) {
	Employee e=new Employee("Ram",26,76536789l,"gandhiji street ,Erode",25000);
	Manager m=new Manager("Sam",26,760642189l,"Rajiv Nagar ,Salem",55000);
	e.printSalary("Ram",25000);
	System.out.println(e.Name);
	System.out.println(e.Age);
	System.out.println(e.PhoneNumber);
	System.out.println(e.Address);
	System.out.println(e.Salary);
	System.out.println(m.Name);
	System.out.println(m.Age);
	System.out.println(m.PhoneNumber);
	System.out.println(m.Address);
	System.out.println(m.Salary);
}
}
