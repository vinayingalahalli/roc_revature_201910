package eg1;

public class CastingDemo {

	public static void main(String[] args) {
		/*
		 * Type Casting - Type casting is the way using which you can convert one primitive type to another.
		 * In which there are 2 types
		 * 1)Implicit Casting -  which is done by the java compiler by default, when we are trying to assign
		 * 						a data type with smaller in size to the larger in size.
		 * 2)Explicit Casting - which should be taken care by the developers, where when we try to assign any larger 
		 * 						data type to the smaller we have to explicitly say to which smaller we wish to 
		 * 						conert it to.
		 */
		int x=100;   //4bytes
		long l=x;   //implicit (long is of 8bytes)
		System.out.println("l = "+l);
		
		double d=x; //implicit
		System.out.println("d = "+d);
		
		float f=l; //implicit (decimal's are larger than the normal values)
		System.out.println("f = "+f);
		
		char c='M';
		System.out.println("c : "+c);
		x=c; // implicit 
		System.out.println("x : "+x);
		
		
		//Explicit Casting
		int d1=99;
		char z=(char)d1;//Explicit(larger to smaller)
		System.out.println("z : "+z);
		
		float t=88.77f;
		System.out.println("t = "+t);
		d1=(int)t; //explicit(remember all the decimal values are larger)
		System.out.println("d1 : "+d1);
		
		

	}

}
