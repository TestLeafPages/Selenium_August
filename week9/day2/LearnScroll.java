package week9.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		//driver.executeScript("scroll(0,500); ");
		
		//driver.findElementByXPath("//li[text()='Item 5']").click();
		WebElement item7 = driver.findElementByXPath("//li[text()='Item 7']");
			
		driver.executeScript("arguments[0].scrollIntoView();", item7);
		item7.click();
		
	//	driver.executeScript("scroll(0,100); ");
	//	driver.executeScript("arguments[0].click();", item7);
		
		/*
		 * Actions builder = new Actions(driver); builder.click(item7).perform();
		 */
		
		
	}

}
