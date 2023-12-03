package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfCheckBox {

	public static void main(String[] args) {
     
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		boolean status = driver.findElement(By.xpath("//label[@for='filled-in-box']")).isEnabled();
		
		if(status==true)
		{
			System.out.println("checkbox is enabled and pass");
		}
		else
		{
			System.out.println("checkbox is not enabled and fail");
		}
	}

}
