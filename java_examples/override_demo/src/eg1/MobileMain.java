package eg1;

public class MobileMain {

	public static void main(String[] args) {
		
		MobileV2 v2=new MobileV2();
		v2.browsing();
		v2.calling();
		v2.gaming();
		v2.message();
		v2.socialNetworkApps();
		v2.displayMenu();
		
		
		/*
		 * Object Casting(applicable only in inheritance & also only & only between parent & child)
		 * Parent - larger
		 * Child - smaller
		 * Implicit - child class object to parent
		 * Explicit - parent class object to child
		 */
		
		System.out.println("\n\nCasting V1"); 
		MobileV1 v1=new MobileV2(); //Implicit Casting
		v1.displayMenu();
		
		MobileV2 v22=(MobileV2)v1; //Explicit Casting
		v22.browsing();
		v22.socialNetworkApps();
		v22.displayMenu();
		
		
		MobileV1 v11=new MobileV1();
		MobileV2 v222=(MobileV2)v11; //ClassCastException
		 

	}

}
