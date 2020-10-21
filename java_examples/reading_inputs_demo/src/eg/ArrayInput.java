package eg;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements for your array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("\nArray after sorting");
		System.out.println(Arrays.toString(ar));

	}

}
