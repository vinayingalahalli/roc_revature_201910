package eg1;

public class Calculator {

	private int x;
	private int y;
	
	public Calculator(String name) {
		System.out.println("Hello "+name);
	}
	
	public Calculator() {
	System.out.println("Non param constructor");
	}
	
	public Calculator(int x,int y) {
		//this is used to point to the current class objects
		this.x=x; //variable shadowing
		this.y=y;
				
	}
	
	public int add() {
		return x+y;
	}
	
	public int multiply() {
		return x*y;
	}
	public int subtract() {
		return x-y;
	}

}
