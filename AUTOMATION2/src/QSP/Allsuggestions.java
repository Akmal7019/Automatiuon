package QSP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allsuggestions {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.google.com/");
	
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		List<WebElement> all = driver.findElements(By.xpath("//span[text()='java']"));
		int count = all.size();
		System.out.println(count);
		for (int i = 0; i <count ; i++)
		{
			String text = all.get(i).getText();
			System.out.println(text);
		}
		all.get(0).click();
			
		}
		
		
			
		
	}


