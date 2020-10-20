package eg2;

public class Employee {

	private int id;
	private String name;
	private long contact;
	private String city;
	private String email;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, long contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public Employee(int id, String name, long contact, String city, String email) {
		this(id,name,contact); //constructor chaining
		this.city = city;
		this.email = email;
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public String getEmail() {
		return email;
	}
	
	

//	public void printEmployee() {
//		System.out.println("Id : "+id);
//		System.out.println("Name : "+name);
//		System.out.println("Contact : "+contact);
//		System.out.println("City : "+city);
//		System.out.println("Email : "+email);
//	}
	
}
