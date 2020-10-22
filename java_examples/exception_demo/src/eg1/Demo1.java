package eg1;

public class Demo1 {

	public static void main(String[] args) {
	
		int x=10;
		int y=0;
		int res=0;
		
		try {
		res=x/y;
		System.out.println(args[0]);
		String s=null;
		System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero...");
		}catch(NullPointerException e) {
			System.out.println("Something is null here");
		}catch(Exception e) {
		System.out.println("some other exception occured "+e);	
		}	
		finally {
			System.out.println("Result is : "+res);
		}
		
		System.out.println("Remaining lines of code in this app");

	}

}
