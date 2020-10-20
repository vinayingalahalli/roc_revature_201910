package eg3;

public class PlayerMain {

	public static void main(String[] args) {
	
		Player p1=new Player(100, "Dinesh");
		System.out.println("Printing p1");
		p1.printPlayer();
		
		
		Team t=new Team(99999, "Rockers", "Duplisies");
		
		Player p2=new Player(101, "Karthik");
		p2.setTeam(t);
		
		System.out.println("\nPrinting p2");
		p2.printPlayer();
		
		
		Player p3=new Player(102, "Yash");
		p3.setTeam(t);
		System.out.println("\nPrinting p3");
		p3.printPlayer();
		
		Team t2=new Team(88888, "Kings", "Steve");
		
		p1.setTeam(t2);
		
		System.out.println("\nPrinting p1 again");
		p1.printPlayer();

	}

}
