package OopsAbstract;

public class TestAbstract {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.header("google login");
		lp.title("google account login");
		lp.search();
		lp.dologin();
	
		
		Login hp = new HomePage();
		
		hp.search();
		hp.header("facebook");
		hp.title("fb login");
		

	}

}
