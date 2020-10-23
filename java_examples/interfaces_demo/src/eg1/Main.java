package eg1;

public class Main {

	public static void main(String[] args) {
	System.out.println("Accessing MyInterface1 methods");
	MyInterface1 i1=new Implementor();
	i1.method1();
	i1.method2();
	i1.method3();
	i1.method4();
	i1.common();
	
	System.out.println("\nAccessing MyInterface2 methods");
	MyInterface2 i2=new Implementor();
	i2.hello1();
	i2.common();
	i2.hello2();
	i2.hello3();
	
	System.out.println("\nAccessing InnerInterface methods");
	
	
	MyInterface1.InnerInterface in=new Implementor();
	in.inner1();
	in.inner2();
	
	}

}
