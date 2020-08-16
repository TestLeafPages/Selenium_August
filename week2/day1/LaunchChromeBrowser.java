package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {
public static void main(String[] args) {
	// Launch the browser first
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver = new FirefoxDriver();
	// Load the url in it
	driver.get("http://leaftaps.com/opentaps/");
	
	// To maximise the browser
	driver.manage().window().maximize();
	
	// To find the element
	WebElement eleUsername = driver.findElementById("username");
	eleUsername.sendKeys("Demosalesmanager");
	
	driver.findElementById("password").sendKeys("crmsfa");
	
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	
	
	

}
}
