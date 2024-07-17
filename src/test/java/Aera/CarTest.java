package Aera;

public class CarTest {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.Start();
		b.Stop();
		b.AutoParking();
		b.Refuel();
		b.Engine();
		
		
	//	Upcasting: Child class object can be referred by parent class reference variable.
		
		
		//Reference Type Check: When parent class reference is referring to the child class object
		Car C1= new BMW();
		C1.Start();
		C1.Stop();
		C1.Refuel();
		C1.Engine();
		
		
		Vehicle v = new BMW();
		
		v.Engine();
	
		
		Car C2 = new Car();
		C2.Start();
		C2.Stop();
		C2.Refuel();
		C2.Engine();
		
		
		//Downcasting: Downcasting is not allowed in java.
		
		/*
		 * BMW c3 = (BMW) new Car(); c3.AutoParking(); c3.Start(); c3.Refuel();
		 * c3.Stop();
		 */
		
		//In Java, multi level inheritance is allowed and multiple inheritance is not allowed. 
		//Multiple inheritance is called Diamond problem
	}

}
