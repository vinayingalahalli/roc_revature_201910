package override_object_demo;

public class Player {

	private int id;
	private String name;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name) {
		super();
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

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean b = false;
		Player p2 = (Player) obj;
		if (this.id == p2.id) {
			b = true;
		}
		return b;
	}

}
