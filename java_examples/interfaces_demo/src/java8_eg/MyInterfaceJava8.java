package java8_eg;

public interface MyInterfaceJava8 {

	public static void helloStatic() {
		System.out.println("Hello from static methods in interface from Java8");
	}
	
	 default void helloDefault() {
		System.out.println("Hello from default method definations from Java8 within interfaces");
	}
}
