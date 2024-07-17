package oopsInterface;

public class Apollo extends WorldHospital implements USMedical, UKMedical{

	@Override
	public void NeuroService() {
	 System.out.println("USMedical  -- NeuroService");
		
	}

	@Override
	public void NineoneoneService() {
		 System.out.println("USMedical ----NineoneoneService");
		
	}

	@Override
	public void PhysioService() {
		 System.out.println("USMedical ----PhysioService");
		
	}

	@Override
	public void VaccineServices() {
		System.out.println("WHO ----VaccineServices");
		
	}

	@Override
	public void pathologyService() {
		System.out.println("UKMedical ----pathologyService");
		
	}

	@Override
	public void DentistService() {
		System.out.println("UKMedical ----DentistService");
		
	}

	@Override
	public void OrthoService() {
		System.out.println("UKMedical ----OrthoService");
		
	}

	
	public void EmergencyService() {
		System.out.println("Apollo ----Emgergency");
		
	}
	
	public void EntService() {
		System.out.println("Apollo ----EntService");
		
	}
}
