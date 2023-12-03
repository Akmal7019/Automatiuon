package QSP;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalltabs {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.linkText("Actimind Inc.")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh)
		{
			driver.switchTo().window(wh);
			driver.close();
		}
	
	}

}
