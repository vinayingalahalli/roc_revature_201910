package egutility;

import java.util.Arrays;

public class ArrayUtilDemo {

	public static void main(String[] args) {
		
		int ar[] = { 22, 11, 22, 33, 11, 22, 33, 11, 227888, 456 };
		
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar));
		
		//for calling binarySearch your array should and must be sorted in ascending order only
		//if search element is found it will print 0 or positive value, if it is not found then it will print -ve value
		System.out.println("Arrays.binarySearch(ar, 100) : "+Arrays.binarySearch(ar, 100));
		System.out.println("Arrays.binarySearch(ar, 33) : "+Arrays.binarySearch(ar, 33));
		
		int ar2[]=Arrays.copyOf(ar, ar.length+10);
		System.out.println("ar2 = "+Arrays.toString(ar2));
		
		int ar3[]=new int [10];
		System.out.println("ar3 = "+Arrays.toString(ar3));
		Arrays.fill(ar3, -22);
		System.out.println("ar3 = "+Arrays.toString(ar3));
		Arrays.fill(ar3, 2, 5, -1000);
		System.out.println("ar3 = "+Arrays.toString(ar3));
		
	}

}
