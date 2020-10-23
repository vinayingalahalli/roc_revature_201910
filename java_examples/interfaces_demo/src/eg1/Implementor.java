package eg1;

public class Implementor  implements MyInterface1,MyInterface2,MyInterface1.InnerInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Hello from MyInterface1 method1() x = "+MyInterface1.X);
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Hello from MyInterface1 method2() ");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Hello from MyInterface1 method3() ");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("Hello from MyInterface1 method4() ");
	}

	@Override
	public void hello1() {
		// TODO Auto-generated method stub
		System.out.println("hello from MyInterface2 hello1() x = "+MyInterface2.X);
	}

	@Override
	public void hello2() {
		// TODO Auto-generated method stub
		System.out.println("hello from MyInterface2 hello2()");
	}

	@Override
	public void hello3() {
		// TODO Auto-generated method stub
		System.out.println("hello from MyInterface2 hello3()");
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("hello from common() for MyInterface2,MyInterface1 ");
	}

	@Override
	public void inner1() {
		// TODO Auto-generated method stub
		System.out.println("Hello inner1()");
	}

	@Override
	public void inner2() {
		// TODO Auto-generated method stub
		System.out.println("Hello inner2()");
	}

}
