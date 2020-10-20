package loops;

public class LoopsDemo {

	public static void main(String[] args) {

		for (int i = 0; i < 11; i++) {
			System.out.println("i = " + i);
		}

		for (int i = 0, j = 10; i < 11; i++, j--) {
			System.out.println("i = " + i + " j = " + j);
		}

		System.out.println("Printing all the even numbers between 1 to 50");
		for (int i = 1; i <= 50; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		int x=0;
		while(x!=10) {
			System.out.println("x = "+(++x));
		//	x++;
		}
		
		int m=1;
		do {
			System.out.println("I will be executed once for sure");
		}while(m!=1);
		
		while(m!=1) {
			System.out.println("I will be executed iff the m value is  != 1");
		}

	}

}
