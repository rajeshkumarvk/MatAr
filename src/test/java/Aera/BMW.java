package Aera;

public class BMW extends Car{
	
	//Method Overriding
	
	
	@Override
	public void Start() {
		
		System.out.println("BMW --- Start");
	}

	public void AutoParking() {
		
		System.out.println("BMW --- auto parking");
	}
}
