package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {

	@Before
	public void preCondition(Scenario sc) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		System.out.println(sc.getName());
		
		System.out.println(sc.getId());
		
		

	}

	@After
	public void postCondition(Scenario sc) {
		driver.close();
		
		System.out.println(sc.getStatus());

	}

}
