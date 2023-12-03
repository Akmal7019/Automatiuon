package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/");
		String text=driver.findElement(By.id("user-login-button")).getText();
		System.out.println(text);
		driver.quit();
	}

}
