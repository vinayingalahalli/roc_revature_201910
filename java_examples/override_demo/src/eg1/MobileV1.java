package eg1;

public class MobileV1 {

	public void calling() {
		System.out.println("Calling feature of V1");
	}
	
	public void message() {
		System.out.println("Send message feature of V1");
	}
	
	public void gaming() {
		System.out.println("Gaming feature of V1");
	}
	
	  void displayMenu() {
		System.out.println("Mobile menu in V1 displays in LIST view");
	}
}
//What all we cannot override?
//->static, private, final

//increasing the visibility from parent in the child
//public -> protected -> default -> private

//Java 7 -> Annotations (@)