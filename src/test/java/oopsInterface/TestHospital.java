package oopsInterface;

public class TestHospital {

	public static void main(String[] args) {
		
		Apollo ap = new Apollo();
		
		ap.NeuroService();
		ap.NineoneoneService();
		ap.PhysioService();
		ap.VaccineServices();
		ap.EmergencyService();
		ap.DentistService();
		ap.EntService();
		ap.polioServices();
		ap.VaccineServices();
		ap.OrthoService();
		
		
		UKMedical uk = new Apollo();
		
		uk.DentistService();
		uk.OrthoService();
		uk.pathologyService();
		
		
		USMedical us = new Apollo();
		 us.NeuroService();
		 us.NineoneoneService();
		 us.PhysioService();
		 us.VaccineServices();
		 
		 USMedical.bloodbank();
		 
		System.out.println(USMedical.min_fee); 

	}

}
