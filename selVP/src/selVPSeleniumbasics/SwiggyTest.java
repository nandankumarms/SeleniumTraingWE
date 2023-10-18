package selVPSeleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		driver.findElement(By.id("location")).sendKeys("Vadapalani qspiders");
		
		driver.findElement(By.xpath("//span[.='QSpiders Vadapalani, and, opposite to Kamala Theatre, above Bank of Baroda, Vadapalani, Chennai, Tamil Nadu, India']")).click();
		
		//click on biriyani
		driver.findElement(By.xpath("https://media-assets.swiggy.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_288,h_360/v1675667625/PC_Creative%20refresh/Biryani_2.png")).click();
		
		driver.findElement(By.xpath("https://media-assets.swiggy.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_660/uykzxdmkrle6wowje5se")).click();
		driver.findElement(By.xpath("//h3[.='Hyderabadi Chicken Dum Biryani']/../../..//div[.='ADD']")).click();
		
		driver.findElement(By.xpath("//button[@id='view-cart-btn']")).click();
	}
}
