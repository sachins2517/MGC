package generic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Result implements ITestListener, IAutoConst, IAnnotationTransformer, IRetryAnalyzer{

	static int passCount=0,failCount=0;
	private int retryCnt = 0;
    private int maxRetryCnt = 2;
    
	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		Reporter.log("Test: "+name+" is Pass",true);
		passCount++;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		Reporter.log("Test: "+name+" is Fail",true);
		failCount++;
	}
	
	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Pass: "+passCount,true);
		Reporter.log("Fail: "+failCount,true);
		Utility.writeResultToXL(RES_PATH, passCount, failCount);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean retry(ITestResult result) {
		if (retryCnt < maxRetryCnt) {
            System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCnt+1));
            retryCnt++;
            return true;
        }
		return false;
	}
	
	@Override
	public void transform(ITestAnnotation testannotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer retry1 = testannotation.getRetryAnalyzer();

		if (retry1 == null)	{
			testannotation.setRetryAnalyzer(Result.class);
		}	
	}
}
