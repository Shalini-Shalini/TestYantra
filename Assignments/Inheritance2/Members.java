package ex2;

public class Members {
	String Name;
	int Age;
	long PhoneNumber;
	String Address;
	long Salary;
	
	public Members(String name, int age, long phoneNumber, String address, long salary) {
		Name = name;
		Age = age;
		PhoneNumber = phoneNumber;
		Address = address;
		Salary = salary;
	}
	public void printSalary(String Name,long Salary) {
		System.out.println(Name+"s salary is" +Salary);
	}

}
