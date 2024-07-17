package OopsAbstract;

public class LoginPage extends Login{
	
	public LoginPage() {
		System.out.println(" Login Page constructor---");	
	}

	@Override
	public void header(String name) {
		System.out.println("login page ---- Header " +name);
		
	}

	@Override
	public void title(String title) {
		System.out.println("login page ---- title " +title);
		
	}

	@Override
	public void search() {
		System.out.println("Search on login Page");
			
		}
	
	public void dologin() {
		System.out.println("login page --do login");
	}
}
