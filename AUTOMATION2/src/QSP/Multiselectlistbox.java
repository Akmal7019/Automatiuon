package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectlistbox {

	public static void main(String[] args) throws InterruptedException {
   
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MOHAMMED%20AKMAL/Desktop/MSLB.html");
		 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		 Select s=new Select(mtrlistbox);
		 s.selectByIndex(0);
		 Thread.sleep(1000);
		 s.selectByValue("v");
		 Thread.sleep(1000);
		 s.selectByVisibleText("dosa");
		 Thread.sleep(1000);
		 s.deselectByIndex(2);
		 Thread.sleep(1000);
		 s.deselectByValue("d");
		 Thread.sleep(1000);
		 s.deselectByVisibleText("idly");
		 Thread.sleep(1000);
		 boolean status = s.isMultiple();
		 System.out.println(status);
	}

}
