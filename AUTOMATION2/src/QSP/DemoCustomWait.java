package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCustomWait {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://chat.qspiders.com/");
		driver.findElement(By.name("username")).sendKeys("raghuramposina9@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Raghuram@9");
		driver.findElement(By.xpath("//button[(text()='Login')]")).click();
		int i=0;
		while(i<50)
		{
			try
			{
				driver.findElement(By.xpath("//button[text()='logout']")).click();
				break;
			}
			catch (Exception e) {
				i++;
			}
		}
	
	}

}
