package eg1;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		/*
		 * Regular Expression(RegEx) - Used for Pattern Matching
		 * 
		 * [] - expression
		 * {} - length
		 * ^ - not
		 * [a-z]{5} - any lowercase word of length 5
		 * [0-9A-Z]{4} - any alphanumeric word of length 4(alphas should be in ucase)
		 * [a-zA-Z]{2,6} - any word of min length 2 and max length of 6
		 * [A-Z]{1,} - minimum 1 uppercase letter
		 * [^0-9] - apart from digits
		 * 
		 */
		
		String s=" H  E  &** *LL  1  234Oa ) a199_";
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^A-Z]", ""));
		System.out.println(s.replaceAll("[^0-9a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^0-9]", ""));
		System.out.println(s.replaceAll("[ 0-9a-zA-Z]", ""));
		
		
		//A string which starts with 5 ucase letters followed by 4 digits and an ucase letter
		String s1="ABCFZ5400I";
		if(s1.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Validated");
		}else {
			System.out.println("Not validated");
		}




	}

}
