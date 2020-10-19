package eg4;

public class Product {
//name and cost are global but are instance or object level
	String name;
	float cost;
	static float discount=9.5f; //global but class level

	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.name="TV";
		p1.cost=89.99f;	
		System.out.println("Printing p1");
		p1.printProduct();
		
		Product p2=new Product();
		p2.name="Laptop";
		p2.cost=189.99f;	
		System.out.println("\nPrinting p2");
		p2.printProduct();
		
		discount=4.2f;
		
		p1.name="Television";
		
		System.out.println("\nPrinting p2 Again");
		p2.printProduct();
		

		System.out.println("\nPrinting p1 Again");
		p1.printProduct();
	}
	
	public  void printProduct() {
		System.out.println("Product Name : "+name);
		System.out.println("Product Cost : "+cost);
		System.out.println("Product disount : "+discount);
	}

}
