package Aera;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


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
	  hp.manageuserlink(testdata.get("EAAPP_MANAGE_USERS_XPATH").toString());
	  hp.userselect(testdata.get("EAAPP_MANAGE_USERS_SELECT_BOX").toString(), testdata.get("EAAPP_MANAGE_USERS_SELECTION").toString(),testdata.get("EAAPP_MANAGE_USERS_ASSIGN").toString());
	  hp.eeapplogout(testdata.get("EAAPP_LOGOUT").toString());
	  
	
  }
}
