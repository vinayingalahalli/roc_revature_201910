package eg3;

import eg2.Hello;
//use extends to make any class as child of other class
//child gets all the properties of the parent apart from anything which is private in parent
//class Child extends Parent{}
public class HelloAgainMain extends Hello{

	public static void main(String[] args) {
		Hello h=new Hello();
		h.helloPublic();
		
		//protected and default is only within the package
		
		//h.helloDefault();
		//h.helloProtected();
		
		//private not visible outside the class
		//h.helloPrivate();
		
		
		// for protected it is accessible in child classes if they are outside the package too
		HelloAgainMain m=new HelloAgainMain();
		m.helloProtected();
		
		//constant
		final int x=100;
		//x=9;

	}

}
