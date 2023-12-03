package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neilalexander.jnacl.crypto.xsalsa20;

public class Flipkartiphoneallsuggestion {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.name("q")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone15promax");
		Thread.sleep(2000);
		List<WebElement> allsug = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']"));
		int count = allsug.size();
		System.out.println(count);
		for (int i = 0; i < count; i++)
		{
			String text = allsug.get(i).getText();
			System.out.println(text);
		}
		//String lastsug = allsug.get(count-1).getText();
		//System.out.println(lastsug);
		driver.quit();
	}

}
