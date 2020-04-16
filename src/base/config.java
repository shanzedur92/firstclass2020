package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import utils.SWDFunctions;

public class config extends SWDFunctions{
	@BeforeTest
	
	public void atthebegining () {
		
		
    System.setProperty("webdriver.chrome.driver","/Users/shanzedurrahim/Documents/github/SeleniumFramework/Drivers/ChromeDriver");
	
	driver= new ChromeDriver ();
	 
	driver.get("https://www.facebook.com/");
	
	
	
	
	}
	










}
