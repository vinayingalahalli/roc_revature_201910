package eg2;

public class Main {

	public static void main(String[] args) {
		Child c=new Impl();
		c.c1();
		c.p1();
		
		Parent p=new Impl();
		p.p1();
		p.p2();

	}

}
