package Aera;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilities {
	
	public static JSONObject testdata;
	
	String filepath = "./test.json.txt"; 
	
	WebDriver driver;
	
	
	
	public Utilities() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public JSONObject readjson(String path) throws IOException, ParseException {
		
			
		JSONParser J_parser = new JSONParser();
		
       FileReader file = new FileReader(path);
       
       return testdata = (JSONObject) J_parser.parse(file);
		
		
		
	}

	public JSONObject loadTestData(String filepath) throws IOException, ParseException {
		
		return testdata =readjson(filepath);
	}

}
