package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFontColourFontTypeFontSize {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String colour = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("color");
		 String size = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-size");
	 String type = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-family");
		System.out.println(colour);
		System.out.println(size);
		System.out.println(type);
		driver.quit();
	}

}
