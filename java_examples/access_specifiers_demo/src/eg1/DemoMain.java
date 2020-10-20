package eg1;

public class DemoMain {

	public static void main(String[] args) {
		
		MyClass.myStatic();
		
		MyClass c=new MyClass();
		c.myNonStatic();
		
		MyClass.InnerPublic i=c.new InnerPublic();
		i.helloInnerPublic();
		
		
		MyClass.InnerStaticPublic.helloInnerPublicStatic();
		
		MyClass.InnerStaticPublic i2=new MyClass.InnerStaticPublic();
		i2.helloInnerStaticNonStatic();
	}

}
