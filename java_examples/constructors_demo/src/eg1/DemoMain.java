package eg1;

public class DemoMain {

	public static void main(String[] args) {
		
		Calculator c=new Calculator("Vinay");
	//	c.x=99;
		Calculator c1=new Calculator();
		
		Calculator c3=new Calculator(19, 99);
		
		
		System.out.println("Accessing using c");
		System.out.println("Add - "+c.add());
		System.out.println("Subtract - "+c.subtract());
		System.out.println("Multiply - "+c.multiply());
		

		System.out.println("\nAccessing using c3");
		System.out.println("Add - "+c3.add());
		System.out.println("Subtract - "+c3.subtract());
		System.out.println("Multiply - "+c3.multiply());
	}

}
