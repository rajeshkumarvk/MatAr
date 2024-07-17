package Aera;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestScripts03 {
	
	
	
	String filepath = "./test.json.txt"; 
  @Test
  public void testscripts() throws IOException, ParseException, InterruptedException {
	  
	
		
	  Homepage hp = new Homepage();
	  
	  JSONObject testdata = hp.loadTestData(filepath);	  
	  hp.navigatetourl(testdata.get("URL8").toString(), testdata.get("LOGIN_BUTTON_XPATH").toString());
	  hp.eeappuser(testdata.get("EAAPP_USERNAME_XPATH").toString(), testdata.get("EAAPP_USERNAME").toString());
	  Thread.sleep(5000);
	  hp.eeappasswd(testdata.get("EAAPP_PASSWORD_XPATH").toString(),testdata.get("EAAPP_PASSWORD").toString(), testdata.get("EAAPP_SUBMIT").toString());
	  hp.eeappHome(testdata.get("EAAPP_TEXT").toString());
		 
	  hp.eeapplogout(testdata.get("EAAPP_LOGOUT").toString());
	  
	
  }
}
