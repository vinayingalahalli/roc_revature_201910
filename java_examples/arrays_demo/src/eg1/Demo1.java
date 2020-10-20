package eg1;

public class Demo1 {

	public static void main(String[] args) {

		int ar[] = { 22, 11, 22, 33, 11, 22, 33, 11, 227888, 456 };

		System.out.println(ar[0]);
		System.out.println("ar.length = " + ar.length);
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}

		// Enhanced for loop or for each loop
		System.out.println("Printing array contents using for each loop");
		for (int x : ar) {
			System.out.println(x);
		}
	}

}
