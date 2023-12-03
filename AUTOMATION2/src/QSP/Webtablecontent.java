package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablecontent {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/table");
		List<WebElement> allcontents = driver.findElements(By.xpath("//div[@class='relative shadow-md sm:rounded-lg']"));
		int count = allcontents.size();
		System.out.println(count);
		for (int i = 0; i < count; i++)
		{
			String text = allcontents.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
