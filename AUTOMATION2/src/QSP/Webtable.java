package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
  

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/table");
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		List<WebElement> contents = driver.findElements(By.xpath("(//aside)[1]"));
	for(WebElement a: contents) {
		System.out.println(a.getText());
		
	}
			
		}
	}


