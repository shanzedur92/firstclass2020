import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumfirstclass2020 {

	public static void main(String[] args) {
    
     System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
		WebDriver driver =new ChromeDriver();
		 
		driver.get("http://www.ebay.com");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
