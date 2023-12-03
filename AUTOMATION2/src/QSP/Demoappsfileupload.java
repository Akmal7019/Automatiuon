package QSP;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoappsfileupload {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(2000);
		File f=new File("./data/AKMAL SQL RESUME.pdf");
		String abpath = f.getAbsolutePath();
		Thread.sleep(2000);
		driver.findElement(By.id("fileInput")).sendKeys(abpath);
	}

}
