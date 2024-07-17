package Aera;

public class Browser {
	
	private String name;
	private double version;
	
	
	public void launchbrowser (String browsername) {
		interactwithOS(browsername);
		System.out.println(" launch the browser " +browsername);
		
	}
	
	private void interactwithOS(String browsername) {
		checkRAMspace(browsername);
	}
	
	private void checkRAMspace(String browsername) {
		checkfilesize(browsername);
		
	}
	
	private void checkfilesize(String browsername) {
		checklatestversion(browsername);
	}
	
	private void checklatestversion(String browsername) {
		System.out.println(" The browser is found : " +browsername);
		
	}
}
