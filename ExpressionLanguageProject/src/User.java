
public class User {
	private String name;
	private String email;
	private int age;
	
	private Address addObj = new Address();
	
	public Address getAddObj() {
		return addObj;
	}
	public void setAddObj(Address addObj) {
		this.addObj = addObj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
