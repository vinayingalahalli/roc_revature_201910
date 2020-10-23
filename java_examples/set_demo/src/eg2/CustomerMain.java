package eg2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomerMain {

	public static void main(String[] args) {
		
		Set<Customer> customers=new HashSet<>();
		customers.add(new Customer(900, "Raj"));
		customers.add(new Customer(100, "Raj"));
		customers.add(new Customer(100, "Raj"));
		customers.add(new Customer(100, "Raj"));
		customers.add(new Customer(100, "Raj"));
		customers.add(new Customer(100, "Raj"));
		customers.add(new Customer(101, "Raj"));
		
		System.out.println("Printing all customers");
//		for(Customer c:customers) {
//			System.out.println(c);
//		}
		Iterator<Customer> i=customers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
