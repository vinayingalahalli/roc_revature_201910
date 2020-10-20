package loops;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("i = "+i+" j = "+j);
			}
		}
		
		System.out.println("Printing all prime numbers between 1 and 50");
		for (int i = 1; i <=50; i++) {
			int c=0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.print(i+" ");
			}
		}

	}

}
