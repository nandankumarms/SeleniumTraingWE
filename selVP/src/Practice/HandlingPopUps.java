package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUps {

	public static void main(String[] args) throws InterruptedException {
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//Navigatet to URL
		driver.get("http://demoapps.qspiders.com/alert");
		
		driver.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
		
		driver.switchTo().alert().sendKeys("Dhoni");
	}
}
