package Aera;

public class LoginUsers {

	public static void main(String[] args) {
		
		//To set class variables using constructor
		
		/*
		 * Credentials cred = new Credentials("Rajesh", "rajesh123");
		 * 
		 * System.out.println(cred.getUsername());
		 * System.out.println(cred.getPassword());
		 */
		
		//To set class variables with setter
		
		Credentials cr = new Credentials();
		
		cr.setUsername("admin");
		cr.setPassword("admin123");
		
		System.out.println(cr.getUsername());
		System.out.println(cr.getPassword());

	}

}
