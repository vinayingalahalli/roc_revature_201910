package eg_iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DemoIterator {

	public static void main(String[] args) {
		// remove all K-V pairs whose key is multiples of 10 or whose value is null;

		Map<Integer, String> hm = new HashMap<>();
		hm.put(1233, "hello");
		hm.put(1230, "updated");
		hm.put(4000, null);
		hm.put(1211, null);
		hm.put(1000, null);
		hm.put(9999, "java");
		hm.put(9990, "java");
		hm.put(1999, "java");
		hm.put(2999, "jse");
		hm.put(5252, "hibernate");
		System.out.println("Before deletion");
		System.out.println(hm);
		
//		for(Entry<Integer, String> e:hm.entrySet()) {
//			if(e.getKey()%10==0 || e.getValue()==null) {
//				hm.remove(e.getKey());
//			}
//		}
		Iterator<Entry<Integer, String>> i=hm.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next(); //read & increment
			if(e.getKey()%10==0 || e.getValue()==null) {
				i.remove();
			}
		}
		
		System.out.println("After deletion");
		System.out.println(hm);

	}

}

//Enumerator-> read from top to bottom
//Iterator - >read and remove from top to bottom
//ListIterator -> add,read,remove and is bidirectional but it is applicable only on List interface