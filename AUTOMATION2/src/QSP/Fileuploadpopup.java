package QSP;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MOHAMMED%20AKMAL/Desktop/naukri.html");
		Thread.sleep(2000);
		File f=new File("./data/AKMAL SQL RESUME.pdf");
		String abpath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(abpath);
	
	}

}
