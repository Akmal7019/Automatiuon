package QSP;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtabs {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.linkText("Actimind Inc.")).click();
		Set<String> allwh = driver.getWindowHandles();
		int count=allwh.size();
		System.out.println(count);
		for (String wh : allwh)
		{
			System.out.println(wh);
		}
		driver.quit();
	}

}
