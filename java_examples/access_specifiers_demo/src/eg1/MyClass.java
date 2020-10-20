package eg1;

public class MyClass {
	
	public static void myStatic() {
		System.out.println("Hello Static from myStatic()");
	}
	public  void myNonStatic() {
		System.out.println("Hello Static from myNonStatic()");
	}

	private class InnerPrivate {

	}

	protected class InnerProtected {

	}

	//no static methods allowed in non static class
	public class InnerPublic {
		
		
		public void helloInnerPublic() {
			System.out.println("Hello from helloInnerPublic()");
		}
		
		
		public class InnerInnerPublic{
			
		}
	}

	//If static class then you can have both static & n on static methods in it
	public static class InnerStaticPublic {
		public static void helloInnerPublicStatic() {
			System.out.println("Hello from helloInnerPublicStatic()");
		}
		public  void helloInnerStaticNonStatic() {
			System.out.println("Hello from helloInnerStaticNonStatic()");
		}
	}
}

class A {

}

class B {

}

class C {

}

//public class M{
//	
//}
