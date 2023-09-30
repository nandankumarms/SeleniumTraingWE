package selVPSeleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("Kavalayya");
		driver.findElement(By.id("search-icon-legacy")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/lM8h5Mm6ODo/hq2.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAd3-fke5y31P-jyHOz_biK-y-TcA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		
	}

}
