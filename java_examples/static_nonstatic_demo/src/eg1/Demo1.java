package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		myStaticMethod();
		
		//Anything which is non-static create object of that class to access it
		//Object creation Syntax   ClassName objName=new Constructor(); Constructor will be having same name as class name
		Demo1 d=new Demo1();
		d.myNonStaticMethod1();
		d.myNonStaticMethod2();
	}
	
	public static void myStaticMethod() {
		System.out.println("Hello from myStaticMethod()");
	}
	
	public void myNonStaticMethod1() {
		System.out.println("Hello from myNonStaticMethod1()");
	}
	
	public void myNonStaticMethod2() {
		System.out.println("Hello from myNonStaticMethod2()");
	}

}
