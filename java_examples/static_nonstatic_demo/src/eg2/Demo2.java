package eg2;

import eg3.Animal;

//Use Import if the class you are accessing is outside
//the current package/folder


public class Demo2 {

	public static void main(String[] args) {
		
		Calculator.helloStaticCalci();
		
		Animal.helloStaticAnimal1();
		Animal.helloStaticAnimal2();
		
		Calculator c=new Calculator();
		c.helloNonStaticCalci();
		
		Animal a =new Animal();
		a.helloNonStaticAnimal();
		
		int result=c.add(100, 22);
		System.out.println("result = "+result);
		
		System.out.println("result = "+c.add(99, 888));
		
		System.out.println("result(a+b+c) =  "+c.add(100, 22, 222));
		
		System.out.println("result(float,float) = "+c.add(99.9f, 88.8f));
		
		c.add(100, 100, 220, 330);
	}

}
