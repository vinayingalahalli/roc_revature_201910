package eg1;

public class ABcEmployer extends EMS{

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("AbcEmp added to MYSQL DB");
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("AbcEmp updated in MYSQL DB");
	}

	@Override
	public void readEmployee() {
		// TODO Auto-generated method stub
		System.out.println("AbcEmp retrived from MYSQL DB");
	}

	@Override
	public void calculateEmployeeSalary() {
		// TODO Auto-generated method stub
		System.out.println("AbcEmp salary calculated from  MYSQL DB");
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		System.out.println("AbcEmp deleted from  MYSQL DB");
	}

}
