package selVPSeleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ShopperStackTest {
public static void main(String[] args) {
	
	//Launch the browser
	
	FirefoxDriver driver=new FirefoxDriver();
	
	//navigate to website
	driver.get("https://indeed.com");
	
	//Get the URL of the webpage
	String ActualUrl=driver.getCurrentUrl();
	
	
	//Expected URL
	String expectedURL="https://indeed.com";
	
	if(expectedURL==ActualUrl) {
		System.out.println("Test case passed");
	 }
	
	else System.out.println("Test case is failed");
	
	//Method to close the browser
	driver.close();
}
}
