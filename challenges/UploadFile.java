package challenges;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	@Test
	public void upload() throws MalformedURLException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		/*
		 * driver.get("http://leafground.com/pages/upload.html");
		 * driver.findElementByName("filename").sendKeys(
		 * "C:\\Users\\hp\\Downloads\\11.KOLAPPAKAM.pdf");
		 */
		 

		driver.get("https://www.naukri.com/"); 
	//	driver.findElementByName("filename").sendKeys("C:\\Users\\hp\\Desktop\\Resume.docx");
		WebElement upload = driver.findElementById("file_upload");
		upload.sendKeys("C:\\Users\\hp\\Downloads\\11.KOLAPPAKAM.pdf");

	}
}