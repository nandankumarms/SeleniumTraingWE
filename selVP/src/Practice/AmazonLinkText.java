package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		WebElement showButton = driver.findElement(By.id("show-textbox"));
	WebElement hiddenTF = driver.findElement(By.id("displayed-text"));
	
	
	JavascriptExecutor je=(JavascriptExecutor) driver;
	je.executeScript("arguments[0].scrollIntoView(false)", driver.findElement(By.xpath("//legend[.='Web Table Fixed header']")));
	Thread.sleep(2000);
	hideButton.click();
	Thread.sleep(2000);
	je.executeScript("arguments[0].value='Virat';", hiddenTF);
	
	showButton.click();
	Thread.sleep(2000);
	hiddenTF.clear();
	hiddenTF.sendKeys("Vitrat");
	
	driver.quit();
	driver.close();
	
	
	}
}
