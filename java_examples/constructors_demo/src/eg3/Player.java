package eg3;

public class Player {

	private int id;
	private String name;
	private Team team;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name) {
	
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	public void printPlayer() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		if(team!=null) {
			System.out.println("Team Details");
			System.out.println("Tid : "+team.getTeamId());
			System.out.println("TeamName : "+team.getTeamName());
			System.out.println("Coach Name : "+team.getCoachName());
		}else {
			System.out.println("Player doesnt have any team");
		}
	}
	
	
	
}
