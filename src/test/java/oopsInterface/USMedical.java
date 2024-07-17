package oopsInterface;

public interface USMedical extends WHO{
	
	int min_fee =100;
	
	public void NeuroService();
	
	public void NineoneoneService();
	
	public void PhysioService();
	
	public static void bloodbank() {
		
		System.out.println("US ----bloodbank");
		
	}

}
