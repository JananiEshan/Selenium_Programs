package iRetry_Analyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic implements IRetryAnalyzer{
	int count=0;//initial count
	int retrytimes=5;//this is the maximum count i need
	@Override
	public boolean retry(ITestResult result) {
		if(count<retrytimes)
		{
			count++;
			return true;	
		}
	
		return false;//will stop the retry logic
	}

}
