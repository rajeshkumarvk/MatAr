package WebDriverArch;

public class TestWebDriver {
	static	WebDriver driver;
	public static void main(String[] args) {
		
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
		 driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
			}
		
	//	WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		driver.findElement("username");
		driver.findElement("password");
		driver.findElement("login button");
		driver.getTitle();

	}

}
