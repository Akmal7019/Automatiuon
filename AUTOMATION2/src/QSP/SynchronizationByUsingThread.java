package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SynchronizationByUsingThread {

	public static void main(String[] args) throws InterruptedException {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://chat.qspiders.com/");
		driver.findElement(By.name("username")).sendKeys("raghuramposina9@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Raghuram@9");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='logout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
	}

}
