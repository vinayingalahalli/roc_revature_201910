package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
	
		Set<String> hs=new HashSet<>();
		hs.add("hello");
		hs.add("java");
		hs.add(null);
		hs.add("hello");
		hs.add("java");
		hs.add(null);
		hs.add("hibernate");
		hs.add("jme");
		hs.add("jee");
		hs.add("spring");
		hs.add("python");
		hs.add("php");
		System.out.println("hs : "+hs);
		
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("hello");
		lhs.add("java");
		lhs.add(null);
		lhs.add("hello");
		lhs.add("java");
		lhs.add(null);
		lhs.add("hibernate");
		lhs.add("jme");
		lhs.add("jee");
		lhs.add("spring");
		lhs.add("python");
		lhs.add("php");
		System.out.println("lhs : "+lhs);
		
		
		//Set<String> ts=new TreeSet<>();//A-Z
		Set<String> ts=new TreeSet<>(Collections.reverseOrder());// Z-A
		ts.add("hello");
		ts.add("java");
	//	ts.add(null);
		ts.add("hello");
		ts.add("java");
	//	ts.add(null);
		ts.add("hibernate");
		ts.add("jme");
		ts.add("jee");
		ts.add("spring");
		ts.add("python");
		ts.add("php");
		System.out.println("ts : "+ts);
		
		System.out.println(ts.size());
		System.out.println(ts.contains("hey"));
		System.out.println(ts.contains("hello"));
		ts.remove("jme");
		System.out.println(ts);
		
		for(String s:ts) {
			System.out.println(s);
		}



	}

}
