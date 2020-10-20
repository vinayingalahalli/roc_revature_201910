package eg2;

public class EmployeeMain {

	public static void main(String[] args) {
	
		Employee e1=new Employee(100, "Sachin", 1234567890L);
		e1.setEmail("e1@mymail.com");
		e1.setCity("Chennai");
		System.out.println("Printing e1");
		//e1.printEmployee();
		printEmployee(e1);
		
		Employee e2=new Employee(101, "Ramesh", 2234867890L);
		e2.setCity("NY");
		e2.setEmail("e2@email.com");
		System.out.println("\nPrinting e2");
		//e2.printEmployee();
		printEmployee(e2);
		
		Employee e3=new Employee(102, "Kim", 12344567890L, "Bangalore", "kim@somemail.com");
		System.out.println("\nPrininting e3");
	//	e3.printEmployee();
		printEmployee(e3);

	}
	
	public static void printEmployee(Employee employee) {
		System.out.println("Id : "+employee.getId());
		System.out.println("Name : "+employee.getName());
		System.out.println("Contact : "+employee.getContact());
		System.out.println("City : "+employee.getCity());
		System.out.println("Email : "+employee.getEmail());
	}

}
