package eg1;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4="heyyy";
		System.out.println("s1.hashCode() : "+s1.hashCode());
		System.out.println("s2.hashCode() : "+s2.hashCode());
		System.out.println("s3.hashCode() : "+s3.hashCode());
		
		System.out.println("System.identityHashCode(s1) : "+System.identityHashCode(s1));
		System.out.println("System.identityHashCode(s2) : "+System.identityHashCode(s2));
		System.out.println("System.identityHashCode(s3) : "+System.identityHashCode(s3));
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		
		System.out.println("s1.equals(s3) : "+s1.equals(s3));
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1.equals(s4) : "+s1.equals(s4));
		
		System.out.println("s1.equalsIgnoreCase(\"HELLo\") : "+s1.equalsIgnoreCase("HELLo"));
		System.out.println("s1.equals(\"HELLo\") : "+s1.equals("HELLo"));
		
		System.out.println("s1.length() : "+s1.length());
		System.out.println("s1.charAt(0) : "+s1.charAt(0));
		
		char c[] =s1.toCharArray();
		System.out.println(Arrays.toString(c));
		
		System.out.println("s1.substring(1) : "+s1.substring(1));
		System.out.println("s1.substring(2,4) : "+s1.substring(2,4));
		
		System.out.println("s1.contains(\"e\") : "+s1.contains("e"));
		System.out.println("s1.contains(\"llo\") : "+s1.contains("llo"));
		System.out.println("s1.contains(\"lol\") : "+s1.contains("lol"));
		
		String s5="hello-hi-good-morning.-have-a wonderful day ahaead";
		
		String[] s6=s5.split("[ -]");
		
		for(String vinay:s6) {
			System.out.println(vinay.toUpperCase());
		}
		
		System.out.println(s5.toUpperCase());

		System.out.println(s5);
		
		s5=s5.toUpperCase();
		System.out.println(s5);
		
		String s7="                  heyy                           ";
		System.out.println(s7);
		
		s7=s7.trim();
		System.out.println(s7);
		
	}
}
