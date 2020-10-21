package eg1;

public class MobileMain {
	public static void main(String[] args) {
		
		MobileV3 v3=new MobileV3();
		v3.calling();
		v3.gaming();
		v3.socialNwApps();
		v3.sendMessage();
		v3.sendMMS();
		System.out.println("v3.getClass() : "+v3.getClass());
		System.out.println("v3.hashCode() : "+v3.hashCode());
		v3.videoCalls();
	}
}
