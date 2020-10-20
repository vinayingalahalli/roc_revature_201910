package eg2;

public class HelloMain {

	public static void main(String[] args) {
		
		Hello h=new Hello();
		h.helloPublic();
		h.helloDefault();
		h.helloProtected();
		
		//private not visible outside the class
		//h.helloPrivate();
				

	}

}
