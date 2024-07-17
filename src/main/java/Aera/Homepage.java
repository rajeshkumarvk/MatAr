package Aera;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends BasePage{
	
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
      	 //pagetext.isDisplayed();
      	 
      //String pagetxt = pagetext.getText();
      
      //System.out.println(pagetxt);
      System.out.println(pagetext.getText());
    	
    //	 Assert.assertEquals(true, pagetext.isDisplayed());
      	 
	/*
	 * SoftAssert sa = new SoftAssert(); sa.assertEquals(true,
	 * pagetext.isDisplayed());
	 * 
	 * 
	 * 
	 * Reporter.log("The website used was DemoQA for this test", true); String
	 * expectedTitle = "Free QA Automation Tools For Everyone"; String originalTitle
	 * = driver.getTitle(); Assert.assertEquals(originalTitle, expectedTitle,
	 * "Titles of the website do not match");
	 */
      	 
    	 
    	 
    	 
    	
	
	//Alert alert = driver.switchTo().alert();
	//alert.accept();
}
     
     public void manageuserlink(String manage_user_xpath) {
 		
 		WebElement manage_user_link = driver.findElement(By.xpath(manage_user_xpath));
 			manage_user_link.click();
 			
 	}
     
	public void userselect(String Roles_xpath , String Roles_select , String Roles_selection) {
		
		WebElement us_sel = driver.findElement(By.xpath(Roles_xpath));
			us_sel.click();
			
		WebElement sel_role = driver.findElement(By.xpath(Roles_select));
		sel_role.click();
		
		WebElement role_sel = driver.findElement(By.xpath(Roles_selection));
		role_sel.click();
	}
		     
	  public void eeapplogout(String logout) {
	  
	  
	  WebElement log_out = driver.findElement(By.xpath(logout));
	  
	  log_out.click();
	  
	  driver.quit();
	  
	  
	  }
	 	 		
}
