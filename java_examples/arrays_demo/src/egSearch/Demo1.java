package egSearch;

public class Demo1 {

	public static void main(String[] args) {
		int ar[] = { 22, 11, 22, 33, 11, 22, 33, 11, 227888, 456 };

		SearchArray s=new SearchArray();
		if(s.isValueExisting(ar, 22)) {
			System.out.println("Found");
		}else {
			System.out.println("Not found");
		}
		
		
		s.printAllLocationsOfSearchValue(ar, 11);
		
		s.printAllPrimeNumbersinArray(ar);
	}
	
	

}
