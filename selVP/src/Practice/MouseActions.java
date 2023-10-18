package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
 public static void main(String[] args) {
	
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://flipkart.com");
	 
	 driver.findElement(By.xpath("//div[@class='JFPqaw']/span")).click();
	 driver.findElement(By.partialLinkText("Sign in")).click();
	 Actions action=new Actions(driver);
	 
	 action.scrollByAmount(0, 100).perform();
	 
}
}
