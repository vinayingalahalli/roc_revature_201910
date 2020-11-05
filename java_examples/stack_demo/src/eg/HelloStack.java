package eg;

import java.util.Stack;

public class HelloStack {

	public static void main(String[] args) {
	
		Stack<Integer> s1=new Stack<>();
		s1.push(990);
		s1.push(1000);
		s1.push(100);
		s1.push(200);
		s1.push(300);
		s1.push(100);
		s1.push(400);
		s1.push(100);
		s1.push(900);
		System.out.println(s1);
		
		System.out.println("s1.peek() = "+s1.peek());
		System.out.println("stack = "+s1);
		System.out.println("s1.pop() = "+s1.pop());
		System.out.println("stack = "+s1);

	}

}
