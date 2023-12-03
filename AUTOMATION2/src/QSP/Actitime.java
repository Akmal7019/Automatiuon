package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//div[@class='popup_menu_icon support_icon']")).click();
		driver.findElement(By.linkText("About your actitime")).click();
		driver.findElement(By.xpath("//a[text()='Read License Agreement']")).click();
		List<WebElement> all = driver.findElements(By.xpath("h2"));
		int count=all.size();
		System.out.println(count);
		for (int i = 0; i <count; i++) 
		{
			String text = all.get(i).getText();
			System.out.println(text);
			driver.quit();
		}
		driver.close();
		
	}

}
