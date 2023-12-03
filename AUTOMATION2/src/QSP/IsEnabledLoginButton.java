package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledLoginButton {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logbutton = driver.findElement(By.name("login")).isEnabled();
		
		if(logbutton==true)
		{
			System.out.println("login button is enabled and pass");
			
		}
		else
		{
			System.out.println("login button is not enabled and fail");	
		}
	}

}
