package testng.day3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer{

	int maxRetry = 3;
	int count = 0;
	
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess() && count < maxRetry) {
			count++;
			return true;
		}
		
		return false;
	}

}
