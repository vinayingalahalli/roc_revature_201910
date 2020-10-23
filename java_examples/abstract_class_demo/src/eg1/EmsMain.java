package eg1;

public class EmsMain {

	public static void main(String[] args) {
		
		System.out.println("Accessing EMS using RevatureEmployer");
		EMS revEmp=new RevatureEmployer();
		revEmp.addEmployee();
		revEmp.commonEmployeeBenifits();
		revEmp.updateEmployee();
		revEmp.calculateEmployeeSalary();
		revEmp.readEmployee();
		revEmp.deleteEmployee();
		
		
		System.out.println("\n\nAccessing EMS using ABcEmployer");
		EMS abcEmp=new ABcEmployer();
		abcEmp.addEmployee();
		abcEmp.updateEmployee();
		abcEmp.calculateEmployeeSalary();
		abcEmp.commonEmployeeBenifits();
		abcEmp.readEmployee();
		abcEmp.deleteEmployee();
	}

}
