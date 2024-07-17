package Aera;

public class User {
	//Class Variables
	String name;
	String emailID;
	long phonenumber;
	boolean isActive;

	//Class Methods -1
	public String getOrderdetails(String username) {
		
		if(username.equals("Rajesh")) {
			return "Macbook pro";
		}
		
		else if(username.equals("Veeresh")) {
			return "Mac notebook";
		}
		
		else if(username.equals("Gopinath")) {
			return "Dell";
		}
		
		else{
			System.out.println(username + " is not present");
			return "user not present";
		}
	}
	
	//Class Methods -2
	
	public long getphonenumber(String username) {
		
		if(name.equals("Rajesh")) {
			return 901810010;
		}
		
		else if(name.equals("Veeresh")) {
			return 990810012;
		}
		
		else if(name.equals("Veeresh")) {
			return 980810012;
		}
		else{
			
			System.out.println(username + " is not present");
			return -1;
		}
	}
	public static void main(String[] args) {
		 
		User user = new User();
			
		user.name ="Veeresh";
		user.phonenumber = 901910111;
		
		String itm = user.getOrderdetails(user.name);
		System.out.println(itm);
		
	
		
		String items = user.getOrderdetails(user.name);
		System.out.println(items);
		
	
		
		long ph = user.getphonenumber(user.name);
		System.out.println(ph);
				

	}

}
