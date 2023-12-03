package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wiprojobs {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(3000);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a[@jsname='UWckNb']"));
		int count=alllinks.size();
		System.out.println(count);
		for (int i = 0; i <count; i++) {
			String link = alllinks.get(i).getAttribute("href");
			System.out.println(link);
		}
		driver.quit();
	}

}
