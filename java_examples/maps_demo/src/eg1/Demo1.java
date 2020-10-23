package eg1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1233, "hello");//insertion
		hm.put(1233, "updated");//updation if the key is same
		hm.put(null, null);
		hm.put(1211, null);
		hm.put(1000, null);
		hm.put(9999, "java");
		hm.put(9990, "java");
		hm.put(1999, "java");
		hm.put(2999, "jse");
		hm.put(5252, "hibernate");
		System.out.println("hm : "+hm);
		
		Map<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(1233, "hello");//insertion
		lhm.put(1233, "updated");//updation if the key is same
		lhm.put(null, null);
		lhm.put(1211, null);
		lhm.put(1000, null);
		lhm.put(9999, "java");
		lhm.put(9990, "java");
		lhm.put(1999, "java");
		lhm.put(2999, "jse");
		lhm.put(5252, "hibernate");
		System.out.println("lhm : "+lhm);
		
		
		Map<Integer, String> tm = new TreeMap<>(Collections.reverseOrder());
		tm.put(1233, "hello");//insertion
		tm.put(1233, "updated");//updation if the key is same
	//	tm.put(null, null);
		tm.put(1211, null);
		tm.put(1000, null);
		tm.put(9999, "java");
		tm.put(9990, "java");
		tm.put(1999, "java");
		tm.put(2999, "jse");
		tm.put(5252, "hibernate");
		System.out.println("tm : "+tm);
		
		
		Map<Integer, String> ht = new Hashtable<>();
		ht.put(1233, "hello");//insertion
		ht.put(1233, "updated");//updation if the key is same
	//	ht.put(null, null);
	//	ht.put(1211, null);
	//	ht.put(1000, null);
		ht.put(9999, "java");
		ht.put(9990, "java");
		ht.put(1999, "java");
		ht.put(2999, "jse");
		ht.put(5252, "hibernate");
		System.out.println("ht : "+ht);
		
		System.out.println(ht.size());
		System.out.println("ht.get(1000) : "+ht.get(1000));
		System.out.println("ht.get(5252) : "+ht.get(5252));
		
		System.out.println("ht.containsKey(1000) : "+ht.containsKey(1000));
		System.out.println("ht.containsKey(5252) : "+ht.containsKey(5252));
		
		System.out.println("ht.containsValue(\"java\") : "+ht.containsValue("java"));
		System.out.println("ht.containsValue(\"jme\") : "+ht.containsValue("jme"));
		
		ht.remove(5252);
		System.out.println("ht : "+ht);
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		System.out.println("\nIterating using keySet()");
		Set<Integer> hs=ht.keySet();
		for(Integer i:hs) {
			System.out.println("key = "+i+" value = "+ht.get(i));
		}
		
		System.out.println("\nIterating using entrySet()");
		for(Entry<Integer, String> e:ht.entrySet()) {
			System.out.println("Key -> "+e.getKey()+" Value -> "+e.getValue());
		}
		
		
	}

}
