package eg_lambda_modular_way;

public class LambdaMain {

	public static void main(String[] args) {
		
		SortFunctional s1=()->System.out.println("Hello Lambda");
		s1.sortAnything();
		
		SortFunctional s2=()->System.out.println("Hello Lambda Again");
		s2.sortAnything();
		
		
		HelloFunctional h1=(n)->System.out.println("Hello "+n);
		
		h1.sayHello("Ramesh");
		h1.sayHello("Suresh");
		
		Addition a=(x,y,z)->{
			return x+y+z;
		};
		System.out.println(a.add(100, 33, 6666));
	}

}
