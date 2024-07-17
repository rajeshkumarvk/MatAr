package OopsAbstract;

public class HomePage extends Login{

	@Override
	public void header(String name) {
		System.out.println("home page ---- Header " +name);
		
	}

	@Override
	public void title(String title){
		System.out.println("home page ---- title " +title);
		
	}
	
	@Override
	public void search() {
		System.out.println("Search on home Page");
	}
}
