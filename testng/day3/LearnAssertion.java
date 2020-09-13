package testng.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LearnAssertion {
	
	@Test
	public void testCase1() {
		String expectedTitle = "TestLeaf123";
		
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://leaftaps.com/opentaps/");
		 */
		String actualTitle = "TestLeaf";
		
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		
		//Assert.assertEquals(expectedTitle, actualTitle);
		
		
		
		
		System.out.println("message after assertion");
		
			
		
		//String actualTitle = driver.getTitle();
		
		/*
		 * if(expectedTitle.equals(actualTitle)) { System.out.println("pass"); } else {
		 * System.out.println("fail"); }
		 */
		
		softAssert.assertAll();

	}

}
