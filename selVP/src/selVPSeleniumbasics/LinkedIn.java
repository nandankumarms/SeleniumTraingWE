package selVPSeleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException {
		//Launch chromebrowser
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to Naukri.com
		driver.get("https://www.linkedin.com/");
		
		//Click on Jobs button
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/jobs/search?trk=guest_homepage-basic_guest_nav_menu_jobs']")).click();
		Thread.sleep(2000);
		//Click on company Button
		driver.findElement(By.xpath("//button[@aria-label='Company filter. Clicking this button displays all Company filter options.']")).click();
		Thread.sleep(2000);
		//Search for ZOHO
		driver.findElement(By.id("f_C")).sendKeys("ZOHO");
		Thread.sleep(2000);
		
		//Select ZOHO From the list
		driver.findElement(By.xpath("//li[contains(@class, 'search-suggestion') and contains(text(),'Zoho')]")).click();
		
		
	}
}