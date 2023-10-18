package selVPSeleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeTest {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://youtube.com");
		
		driver.findElement(By.name("search_query")).sendKeys("Leo song");
		
		driver.findElement(By.id("search-icon-legacy")).click();

		driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/szvt1vD0Uug/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLB3Z3ZG2rNlsu7q2jO7Ub8f9Esgjw']")).click();
		
		
		driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")));
			driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).click();
		} catch (Exception e) {
			System.out.println("Skip add not found");
		}
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='No thanks']")));
			driver.findElement(By.xpath("//yt-button-renderer[@id='dismiss-button']")).click();
			
		} catch (Exception e) {
			System.out.println("No thanks not found");
		}
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@title='Pause (k)']")));
		driver.findElement(By.xpath("//button[@title='Pause (k)']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//video")).click();
		Thread.sleep(10000);
		
		//click on escape button
	     Robot robot=new Robot();
	     robot.keyPress(KeyEvent.VK_ESCAPE);
	     robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		driver.findElement(By.name("search_query")).clear();
		driver.findElement(By.name("search_query")).sendKeys("kgf 2 tamil shooting scene",Keys.ENTER);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/watch?v=9PBvOwwdxvg&pp=ygUaa2dmIDIgdGFtaWwgc2hvb3Rpbmcgc2NlbmU%3D']/../..")));
		driver.findElement(By.xpath("//a[@href='/watch?v=9PBvOwwdxvg&pp=ygUaa2dmIDIgdGFtaWwgc2hvb3Rpbmcgc2NlbmU%3D']/../..")).click();
		
        driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")));
			driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).click();
		} catch (Exception e) {
			System.out.println("Skip add not found");
		}
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='No thanks']")));
			driver.findElement(By.xpath("//yt-button-renderer[@id='dismiss-button']")).click();
			
		} catch (Exception e) {
			System.out.println("No thanks not found");
		}
		
		Thread.sleep(120000);
		
		driver.quit();
		
	}
	
}
