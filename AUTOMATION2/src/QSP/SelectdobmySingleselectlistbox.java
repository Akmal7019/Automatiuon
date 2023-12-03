package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectdobmySingleselectlistbox {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement daylistbox = driver.findElement(By.id("day"));
		Select s=new Select(daylistbox);
		s.selectByIndex(24);
		Thread.sleep(3000);
		WebElement monthlistbox = driver.findElement(By.id("month"));
		Select s1=new Select(monthlistbox);
		Thread.sleep(3000);
		s1.selectByValue("4");
		Thread.sleep(3000);
		s1.selectByIndex(0);
		Thread.sleep(3000);
		s1.selectByVisibleText("Oct");
		Thread.sleep(3000);
		WebElement yearlistbox = driver.findElement(By.id("year"));
		Select s2=new Select(yearlistbox);
		s2.selectByVisibleText("1997");
	}

}
