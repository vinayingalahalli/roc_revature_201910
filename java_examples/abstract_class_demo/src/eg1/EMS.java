package eg1;

public abstract class EMS {

	public abstract void addEmployee();
	public abstract void updateEmployee();
	public abstract void readEmployee();
	public abstract void calculateEmployeeSalary();
	public abstract void deleteEmployee();
	
	public void commonEmployeeBenifits() {
		System.out.println("Common Emp benifits to any employees in the world");
	}
}
