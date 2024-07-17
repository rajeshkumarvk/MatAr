package Aera;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage extends Utilities{
	public static WebDriver driver;
	
	
	
	public BasePage() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}
	
}
