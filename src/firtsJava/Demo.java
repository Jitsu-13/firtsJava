package firtsJava;

public class Demo {
	private String Name;
	private Integer roll;
	private String address;
	
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Demo(String name, Integer roll, String address) {
		super();
		Name = name;
		this.roll = roll;
		this.address = address;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Demo [Name=" + Name + ", roll=" + roll + ", address=" + address + "]";
	}
	
	
	

}
