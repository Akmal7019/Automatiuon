package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HAndling_Notification_Popup_QSP {

	public static void main(String[] args) throws Exception {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demoapps.qspiders.com/browserNot?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.id("browNotButton")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
