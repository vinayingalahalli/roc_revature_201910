package eg2;

public class Hello {

	private void helloPrivate() {
		System.out.println("Hello from the helloPrivate()");
	}
	
	public void helloPublic() {
		System.out.println("Hello from helloPublic()");
	}
	
	protected void helloProtected() {
		System.out.println("Hello from helloProtected()");
	}
	
	 void helloDefault() {
		System.out.println("Hello from helloDefault()");
	}
}
