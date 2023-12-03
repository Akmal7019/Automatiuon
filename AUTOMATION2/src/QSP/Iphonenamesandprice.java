package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphonenamesandprice {

	public static void main(String[] args)  {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 15 pro max");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> alliph = driver.findElements(By.xpath("//div[contains(text(),'iPhone 15 Pro Max')]"));
		List<WebElement> allprs = driver.findElements(By.xpath("//div[contains(@class,'_30jeq3 _1_WHN1')]"));
		int count=alliph.size();
		System.out.println(count);
		
		for (int i = 0; i <count; i++)
		{
			String text1= alliph.get(i).getText();
			String text2 = allprs.get(i).getText();
			System.out.println(text1+"="+ text2);
		}
		driver.quit();
	}
	
	

}
