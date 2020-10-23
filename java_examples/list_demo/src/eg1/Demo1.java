package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {
	
		List li=new LinkedList();
		li.add("hello");
		li.add(1211111);
		li.add(true);
		li.add('d');
		li.add(1233.4455f);
		System.out.println(li);
		
		//Left hand side should be the interface and righ hand side should be its implementing class
		List<Integer> list1=new ArrayList<>();
		list1.add(123);
		list1.add(123);
		list1.add(121);
		list1.add(null);
		list1.add(null);
		list1.add(44);
		list1.add(12);
		list1.add(123);
		list1.add(123);
		list1.add(null);
		list1.add(55);//insertion at the end
		System.out.println("list1 : "+list1);
		list1.add(1, 66); // insertion at specific position
		System.out.println("list1 : "+list1);
		list1.set(3, 77);//updation
		System.out.println("list1 : "+list1);
		
		list1.remove(1); //index(position)
		System.out.println("list1 : "+list1);
		
		Integer i=123;
		list1.remove(i); //removes first occurance of that object value
		System.out.println("list1 : "+list1);
		
		while(list1.remove(i)) {} //remove all the occurances of that object value
		System.out.println("list1 : "+list1);
		
		System.out.println("list1.get(3) : "+list1.get(3)); //it is equal to ar[3]
		System.out.println("list1.size() : "+list1.size()); //no of elements in the list
		
		System.out.println("list1.contains(100) : "+list1.contains(100));
		System.out.println("list1.contains(null) : "+list1.contains(null));
		
		System.out.println("Iterating using normal for loop");
		for (int j = 0; j < list1.size(); j++) {
			System.out.println(list1.get(j));
		}
		System.out.println("Iterating using a for each loop");
		for(Integer i2:list1) {
			System.out.println(i2);
		}
		
		List<Integer> list2=new Vector<>(list1); //copy all contents of list1 - method-1
		System.out.println("list2 : "+list2);
		list2.addAll(list1); //copy all contents of list1 - method-2
		System.out.println("list2 : "+list2);
		list2.add(33);
		list2.add(44);
		list2.add(55);
		list2.add(66);
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		//list2.retainAll(list1); //common between list2 and list1 and result will be stored in list2
		list2.removeAll(list1); //non common between list2 and list1 and result is stored in list2
		System.out.println("list2 : "+list2);
		
		System.out.println("list1 : "+list1);
		Collections.reverse(list1);
		System.out.println("list1 : "+list1);
		Collections.shuffle(list1);
		System.out.println("list1 : "+list1);
		
		Collections.replaceAll(list1, null, -1);
		System.out.println("list1 : "+list1);
		Collections.sort(list1); //it will throw NPE if i Have null values inside the list and sorts here by ascending order
		
		System.out.println("list1 : "+list1);
		
		Collections.sort(list1, Collections.reverseOrder()); //sorts in descending order
		System.out.println("list1 : "+list1);
		
		//binarySearch()- sorted in ascending to perform binarySearch()
		Collections.sort(list1);
		System.out.println("list1 : "+list1);
		System.out.println("Collections.binarySearch(list1, 100) : "+Collections.binarySearch(list1, 100));
		System.out.println("Collections.binarySearch(list1, -1) : "+Collections.binarySearch(list1, -1));
		System.out.println("Collections.binarySearch(list1, 77) : "+Collections.binarySearch(list1, 77));
		
		System.out.println("Printing list1 elements using Iterator");
		Iterator<Integer> i2=list1.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
			
		}
		
	}

}//Task here is to recreate the same and try the same way to explore about the Queue Interface
