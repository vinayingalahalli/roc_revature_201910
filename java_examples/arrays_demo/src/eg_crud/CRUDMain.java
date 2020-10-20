package eg_crud;

public class CRUDMain {

	public static void main(String[] args) {
		int ar[] = new int[10];
		ar[0] = 111;
		ar[1] = 2;
		ar[2] = 77;
		ar[3] = 4;
		ar[4] = 33;
		ar[5] = 100;
		int n = 6;

		System.out.println("Printing array contents");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		int pos = 3;
		int value = 99;
		for (int i = n; i >= pos; i--) {
			ar[i] = ar[i - 1];
		}
		ar[pos - 1] = value;
		n++;
		System.out.println("\nPrinting array contents after insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}

		int delpos = 5;
		for (int i = delpos - 1; i < n; i++) {
			ar[i]=ar[i+1];
		}
		n--;
		
		System.out.println("\nPrinting array contents after deletion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
