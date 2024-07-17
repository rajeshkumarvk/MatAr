package Aera;

public class Userstest {

	public static void main(String[] args) {
	 Users u1 = new Users();
	u1.setName("Rajesh");
	u1.setAge(44);
	u1.setPhone(909091);
	
	System.out.println(u1.getName());
	System.out.println(u1.getAge());
	System.out.println(u1.getPhone());
	 
	u1.getusersalaryinfo();
	}

}
