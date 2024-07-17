package Aera;

public class ArrayListAssignments2 {

	public static void main(String[] args) {
		/*Question 2: Write a program to create a static Array, having following cricket data:

		                        --name, age, team name, DOB, gender, Strike Rate

		                        --Try to create multiple Object Arrays for different players 

		                        --Try to print all the values of each player on the console*/
		
		String name[] = new String[1];
		name[0] = "Rajesh";
		
		int age[] = new int[1];
		age[0] = 44;
		
		String team[] = new String[1];
		team[0] = "RCB";
		
		int dob[] = new int[1];
		dob[0] = 1979;
		
		boolean gen[] = new boolean[1];
		gen[0] = "M"!= null;
		
		double strike[] = new double[1];
		strike[0] = 87.32;
		
		System.out.println("Name " +name[0]);
		System.out.println("Age " +age[0]);
		System.out.println("Team " +team[0]);
		System.out.println("DOB " +dob[0]);
		System.out.println("gender " +gen[0]);
		System.out.println("strike rate " +strike[0]);
		
		System.out.println("===================");
		
		Object Player1[] = new Object[6];
		
		Player1[0] = "Gopinath";
		Player1[1] = 45;
		Player1[2] = "Chennai Kings";
		Player1[3] = 1977;
		Player1[4] = "Male";
		Player1[5] = 88.9;

		Object Player2[] = new Object[6];
		
		Player2[0] = "Veeresh";
		Player2[1] = 44;
		Player2[2] = "Mumbai Indians";
		Player2[3] = 1979;
		Player2[4] = "Male";
		Player2[5] = 89.9;
		
		Object Player3[] = new Object[6];
		
		Player3[0] = "Ramesh";
		Player3[1] = 44;
		Player3[2] = "Kolkata Riders";
		Player3[3] = 1979;
		Player3[4] = "Male";
		Player3[5] = 99.9;
		
		for (int i =0; i<Player1.length; i++) {
		System.out.println(Player1[i]);
		
		
	}
		System.out.println("===================");
		
		for (int i =0; i<Player1.length; i++) {
			System.out.println(Player2[i]);
			
		
		}
		
		System.out.println("===================");
		
		for (int i =0; i<Player1.length; i++) {
			System.out.println(Player3[i]);
		}
}
	}
