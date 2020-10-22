package examples;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String s1 = sb.toString();
		if (s.equals(s1)) {
			System.out.println("Yes its Palindrome");
		} else {
			System.out.println("Nope not palindrome");
		}
		
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
		int x=1010;
		//s=x+"";
		if(new StringBuffer(x+"").reverse().toString().equals(x+"")) {
			System.out.println("Palindrome INT");
		}else {
			System.out.println("Not palindrome Int");
		}

	}

}
