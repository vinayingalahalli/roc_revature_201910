package eg2;

public class Calculator {

	public static void helloStaticCalci() {
		System.out.println("Hello from helloStaticCalci()");
	}
	
	public void helloNonStaticCalci() {
		System.out.println("Hello from helloNonStaticCalci()");
	}
	
	//Method Overloading - same method name but 
	// unique parameters list
	public int add(int a,int b) {
		return a+b;
	}
	
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public float add(float a,float b) {
		return a+b;
	}
	
	public void add(int a,int b,int c,int d) {
		 System.out.println("a+b+c+d = "+(a+b+c+d));
	}
}
