package egSearch;

public class SearchArray {

	public boolean isValueExisting(int ar[],int searchElement) {
		boolean b=false;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==searchElement) {
				b=true;
				break;
			}
		}
		return b;
	}
	
	public void printAllLocationsOfSearchValue(int ar[],int searchElement) {
		
		
			boolean b=false;
			for (int i = 0; i < ar.length; i++) {
				if(ar[i]==searchElement) {
					b=true;
					System.out.println(searchElement+" found at position "+(i+1));
				}
			}
			if(b==false) {
				System.out.println(searchElement+" not found");
			}
	}
	
	public void printAllPrimeNumbersinArray(int ar[]) {
		int count=0;
		System.out.println("Printing all Prime numbers in your array");
		for (int i = 0; i < ar.length; i++) {
			int c=0;
			for (int j = 1; j <= ar[i]; j++) {
				if(ar[i]%j==0) {
					c++;
					
				}
			}
			if(c==2) {
				count++;
				System.out.print(ar[i]+" ");
			}
			
			
		}
		if(count==0) {
			System.out.println("No prime numbers in array");
		}else {
			System.out.println("\nTotal we found "+count+" no of prime elements in your array");
		}
		
	}
}
