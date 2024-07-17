package Aera;

public class StatciConcepts {

	//Class Variables
	
	String name;
	static int age = 25;
	
	public void getName() {
		
		System.out.println("get name ");
		
	}
	
	public static void getvalue() {
		
		System.out.println("get value ");
	}
	public static void main(String[] args) {
		
			
		 StatciConcepts obj = new StatciConcepts();
		 
		 obj.name="ram";
		 
		
		// obj.age = 25;
		 
		 //static way- is calling directly
		 System.out.println(age);
		 getvalue();
		 StatciConcepts.getvalue();
		 
		 System.out.println(StatciConcepts.age);
			
		 
		 
	}

}
