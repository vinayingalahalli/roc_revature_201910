package eg1;

public interface MyInterface1 {

	int X=100; //by default static and final
	void method1(); //by default it is public & abstract
	void method2();
	void method3();
	void method4();
	void common();
	
	public interface InnerInterface{
		void inner1();
		void inner2();
	}
}
