package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {

	public static void main(String[] args) {
   
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MOHAMMED%20AKMAL/Desktop/demo1.html");
		driver.findElement(By.tagName("a")).click();
	}

}
