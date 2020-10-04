package week9.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWaits {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/appear.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		Wait<ChromeDriver> wait = new FluentWait<ChromeDriver>(driver).withTimeout(Duration.ofSeconds(10))
																	  .pollingEvery(Duration.ofMillis(100))
																	  .ignoring(NoSuchElementException.class);
				
		
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement voila = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Voila')]")));
		
		
		
		for (int i = 0; i < 20; i++) {
			//WebElement checkIn = driver.findElementByXPath("//img[@alt='Support the jQuery Foundation']");

			((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', arguments[1]);", voila,
					"color: Yellow; border: 10px dotted solid green;");
			Thread.sleep(300);
			((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', arguments[1]);", voila,
					"color: transparent;");
			Thread.sleep(300);
		}
		
		
		
		System.out.println("last line of code");
		
		
		
		
	//	driver.findElementByXPath("//button[text()='Ok']").click();
				
	//	driver.findElementById("username").sendKeys("demosalesmanager");
		
		
		

		 //driver.findElementById("password123").sendKeys("crmsfa");
	}

}
