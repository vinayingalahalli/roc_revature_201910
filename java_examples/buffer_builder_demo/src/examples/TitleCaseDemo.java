package examples;

public class TitleCaseDemo {

	public static void main(String[] args) {
		String s="hello hi good morning I am enjoying programming with java";
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		for(String s1:ar) {
			sb.append(Character.toUpperCase(s1.charAt(0))).append(s1.substring(1)).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
//Task - Convert every words last char to uppercase