package Aera;

public class Users {
	
	private String name;
	private int age;
	private long phone;
	
	private void getusersalary() {
		System.out.println("get the salary details");
		
	}
	
	public void getusersalaryinfo() {
		getusersalary();
		
	}
	

	//get setter methods
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


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public static void main(String[] args) {
		

	}

}
