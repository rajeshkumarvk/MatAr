package Aera;

import org.json.simple.JSONObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.NoAlertPresentException;

public class Homepage extends Utilities{

	public void navigatetourl(String url , String login_xpath) {
		
		driver.get(url);
		
		WebElement login_link = driver.findElement(By.xpath(login_xpath));
		
		login_link.click();
		
	}
	
public void eeappuser(String username_xpath , String username) {
		
		WebElement user_xpath= driver.findElement(By.xpath(username_xpath));
		user_xpath.sendKeys(username);
		
	}

public void eeappasswd(String passwd_xpath , String passwd, String submit) {
	
	WebElement pass_xpath = driver.findElement(By.xpath(passwd_xpath));
	pass_xpath.sendKeys(passwd);
	
	WebElement sub_btn = driver.findElement(By.xpath(submit));
	
	sub_btn.click();
	
	
	//Alert alert = driver.switchTo().alert();
	//alert.accept();
}

     public void eeappHome(String text) {
	
      	 WebElement pagetext = driver.findElement(By.xpath(text));
    	
    //	 Assert.assertEquals(true, pagetext.isDisplayed());
      	 
      	 SoftAssert sa = new SoftAssert();
      	 sa.assertEquals(true, pagetext.isDisplayed());
      	
      	
      	
      	Reporter.log("The website used was DemoQA for this test", true);
        String expectedTitle = "Free QA Automation Tools For Everyone";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
      	 
    	 
    	 
    	 
    	
	
	//Alert alert = driver.switchTo().alert();
	//alert.accept();
}


 	public void eeapplogout(String logout) {
	
	
	WebElement log_out = driver.findElement(By.xpath(logout));
	
	log_out.click();
	
	driver.quit();
	
	
 	}
	
 		
}
