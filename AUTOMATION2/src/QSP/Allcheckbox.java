package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allcheckbox {

	public static void main(String[] args) throws InterruptedException {
  
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/table");
		driver.findElement(By.xpath("//section[contains(text(),'Check Box')]")).click();
		Thread.sleep(2000);
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
		int count=allcheckbox.size();
		System.out.println(count);
		for (int i = 0; i <count; i++)
		{
			allcheckbox.get(i).click();
			
		}
		driver.quit();
	}

}
