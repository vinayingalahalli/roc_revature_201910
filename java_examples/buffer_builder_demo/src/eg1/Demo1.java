package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello");
		System.out.println("sb = "+sb);
		sb.append(" hello").append(" hey").append(" java").append(1233).append(12.66666f);
		System.out.println(sb);
		sb.insert(1, "Hibernate");
		System.out.println(sb);
		sb.delete(2, 5);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("vinay");
		StringBuffer sb2=new StringBuffer("vinay");
		System.out.println(sb1.equals(sb2));//compares addresses -> equals is not overridden in buffer & builder classes
		System.out.println(sb1.toString().equals(sb2.toString()));
	}

}
