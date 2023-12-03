package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String url = driver.getCurrentUrl();
		String curl = "https://accounts.google.com/";
		if (url.contains(curl)) {
			System.out.println("URL is Navigating successfully and Pass");
		} else {
			System.out.println("URL is Not Navigating successfully and Fail");
		}
		driver.quit();
	}
}
