package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreams {

	public static void main(String[] args) {
	
		List<Integer> list1=Arrays.asList(12,23,11,33,44,11,12,33,11,44);
		System.out.println("list1 = "+list1);
		//Copy all odd integers in different List

		
		List<Integer> list2=new ArrayList<>();
		
		for (int i = 0; i <list1.size(); i++) {
			if(list1.get(i)%2!=0) {
				list2.add(list1.get(i));
			}
		}
		System.out.println("list2 = "+list2);
		
		List<Integer> listStream=list1.stream().filter(x->(x%2)!=0).map(x->x+100).sorted().collect(Collectors.toList());
		System.out.println("listStream = "+listStream);

	}

}
