package java8_eg;

public class Main8 implements MyInterfaceJava8{

	public static void main(String[] args) {
		MyInterfaceJava8.helloStatic();
		MyInterfaceJava8 i=new Main8();
		i.helloDefault();

	}

}
