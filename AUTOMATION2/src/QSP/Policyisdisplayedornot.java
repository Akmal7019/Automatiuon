package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Policyisdisplayedornot {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dob']")).click();
	     WebElement monthlistbox=driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(monthlistbox);
		s.selectByValue("3");
		Thread.sleep(2000);
	    WebElement yearlistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(yearlistbox);
		s1.selectByValue("1997");
		driver.findElement(By.linkText("25")).click();
		//driver.findElement(By.xpath("//table[@class='ui-datepicker-calender']/tbody/tr[4]/td[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("alternative_number")).sendKeys("9845098458");
		Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();
		 boolean text = driver.findElement(By.id("policynumberError")).isDisplayed();
		Thread.sleep(2000);
		if (text==true)
		{
			System.out.println("please enter valid policy no is displayed");
		}
		else 
		{
			System.out.println("please enter valid policy no is not displayed");
		}
		driver.quit();
		
		
		
	}

}
