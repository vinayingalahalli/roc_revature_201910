package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		Integer i1=8;
		Integer i2=8;
		Integer i3=new Integer(8);
		Integer i4=5;
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		System.out.println("i1==i4 : "+(i1==i4));
		
		
		System.out.println("i1.equals(i2) : "+i1.equals(i2));
		System.out.println("i1.equals(i3) : "+i1.equals(i3));
		System.out.println("i1.equals(i4) : "+i1.equals(i4));
		
		int x=100;
		Integer i5=x; //Autoboxing
		System.out.println("x : "+x);
		System.out.println("i5 : "+i5);
		i5=99;
		x=i5;
		System.out.println("x : "+x);
		System.out.println("i5 : "+i5);
		
		System.out.println("Integer.MAX_VALUE : "+Integer.MAX_VALUE);
		System.out.println("Long.MAX_VALUE : "+Long.MAX_VALUE);
		
		System.out.println("Integer.MIN_VALUE : "+Integer.MIN_VALUE);
		
		String s="120";
		Integer i6=Integer.parseInt(s); //WrapperClass.parseXyZ(stringobject); apart from Character class
		System.out.println("i6 : "+i6);
		i6=9999999;
		s=i6.toString();
		System.out.println("s = "+s);
		
		int z=9898989;
		s=z+"";//Anything in java can be converted to the String object by just appending with ""
		System.out.println("s = "+s);
		
		Integer i7=10;
		System.out.println("i7 : "+i7);
		System.out.println("i7.compareTo(10) : "+i7.compareTo(10));
		System.out.println("i7.compareTo(100) : "+i7.compareTo(100));
		System.out.println("i7.compareTo(8) : "+i7.compareTo(8));
		
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toHexString(20));
		System.out.println(Integer.toOctalString(20));
		
		
		Float f=i7.floatValue();
		System.out.println("f = "+f);
		f=88.77f;
		int m=f.intValue();
		System.out.println("m = "+m);
		
		//Try to recreate the same features using Double,Float and Long
	}

}
