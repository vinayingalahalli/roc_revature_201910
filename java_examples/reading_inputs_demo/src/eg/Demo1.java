package eg;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		Employee e2=new Employee();
		System.out.println("Enter Name");
		e2.setName(scanner.nextLine());
		//String name=scanner.nextLine();
		System.out.println("Enter Age");
		//int age=scanner.nextInt();
		//int age=Integer.parseInt(scanner.nextLine());
		e2.setAge(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter salary");
		//double salary=Double.parseDouble(scanner.nextLine());
		e2.setSalary(Double.parseDouble(scanner.nextLine()));
	//	System.out.println("Hello "+name);
	//	System.out.println("Age : "+age);
	//	System.out.println("Salary : "+salary);
		
	//	Employee e1=new Employee(name, age, salary);
	//	System.out.println("e1 = "+e1);
		
		System.out.println("e2 = "+e2);
		
		
		
		

	}

}
