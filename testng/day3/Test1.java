package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Test1 {

	@Test(timeOut = 500)
	public void createLead() throws InterruptedException {

		// throw new NoSuchElementException();

		// Generate random number between 0 to 1

		long ranNum = (long) (Math.random() * 1000);
		System.out.println(ranNum);

		Thread.sleep(ranNum);

	}

}
