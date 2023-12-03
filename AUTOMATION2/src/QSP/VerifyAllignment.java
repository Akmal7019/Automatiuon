package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllignment {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		int x1=driver.findElement(By.name("username")).getLocation().getX();
		Thread.sleep(3000);
		int x2=driver.findElement(By.name("password")).getLocation().getX();
		
		if(x1==x2)
		{
			System.out.println("username and password textbox are properly alligned and pass");
			
		}
		
		else
		{
			System.out.println("username and password textbox are not properly alligned and fail");
		}
	}

}
