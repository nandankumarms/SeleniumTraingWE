package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.id("name")).sendKeys("nandankumar m s");
		
		
	}
}
