package eg2;

public class Player extends Person {
	
	private double averageScore;
	private Team team;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Player(int id, String name, double averageScore, Team team) {
		super(id, name);
		this.averageScore = averageScore;
		this.team = team;
	}
	
	public  void printPlayer() {
		System.out.println("Printing Player");
		printPerson();
		System.out.println("Average Score"+averageScore);
		team.printTeam();
	}

}
