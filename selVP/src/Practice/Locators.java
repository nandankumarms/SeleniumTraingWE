package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
	
		//Launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//navigate to website
		//driver.get("https://www.amazon.com/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		//Identify Email text field and enter your email
//		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//		searchBox.click();
//		
//		searchBox.sendKeys("laptops");
//		Thread.sleep(2000);
//		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Get the text of the element
		//System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed());
//		System.out.println(text);
		
		//System.out.println(driver.findElement(By.id("nav-search-submit-button")).);
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
boolean beforeClick=		driver.findElement(By.xpath("//div[@class='obttn bttn-disabled']")).isEnabled();
//                   

System.out.println(beforeClick);
	}
}
