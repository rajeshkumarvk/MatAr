package OopsAbstract;

public abstract class Login {
	
	public Login() {
		System.out.println("default constructor---");	
	}
	
	
	public Login(int i) {
		System.out.println("1 param---" +i);	
	}
	
	public abstract void header(String name);
	
	public abstract void title(String title);
		
	public void search() {
		System.out.println("Search while login");
	}

}
