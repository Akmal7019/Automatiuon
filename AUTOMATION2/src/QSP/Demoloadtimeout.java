package QSP;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demoloadtimeout {

	public static void main(String[] args) {
   
	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		
		try 
		{
			driver.get("https://www.facebook.com/");
			System.out.println("page is loaded within 3 seconds and pass");
		}
		
		catch (Exception e)
		{
			System.out.println("page is not loaded within 3 seconds and fail");
			
		}
		driver.quit();
		
	}

}
