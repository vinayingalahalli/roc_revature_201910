package eg1;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * Java has 8 primitive data types whose memory gets allocated directly
		 * 
		 * datatype				size(bytes)			defaultValue
		 * ---------------------------------------------------------
		 * byte					1byte					0
		 * short				2						0
		 * int					4						0
		 * long					8						0
		 * 
		 * float				4						0.0000f
		 * double				8						0.0000d
		 * (any decimal values in java by default it considers as double)
		 * 
		 * char					2						'\u00000' (UNI-CODE charset) lookup for UNICODE Table
		 * boolean 				1bit					false
		 *
		 */

		int x=10;
		System.out.println("x = "+x);
		
		float f1=12.3f;
		System.out.println("f1 = "+f1);
		
		double d1=22.333d;
		System.out.println("d1 = "+d1);
		
		long contact=1234567899L;
		System.out.println("contact : "+contact);
		
		boolean b=true;
		System.out.println("b = "+b);
		
		//Please note that String is a class not a primitive data type
		//For all the objects the default value is null
		String s = "Hello String";
		System.out.println("s = "+s);
		
		char c='H';
		System.out.println("c : "+c);
		
	}

}
