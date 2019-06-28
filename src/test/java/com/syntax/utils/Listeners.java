package com.syntax.utils;
import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.syntax.utils.BaseClass;
public class Listeners extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test case started:" +result.getName());
		test=report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed:"+result.getName());
		test.pass("Test passed:"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed:"+result.getName());
		test.fail("Test failed:"+result.getName());
		String imagePath=CommonMethods.takeScreenshot(result.getName());
		try {
			test.addScreenCaptureFromPath(imagePath);
		} catch (IOException e) {
			e.printStackTrace();
			test.info("Not able to attach screenshot");
		}
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped:"+result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		System.out.println("Test started:"+context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test finished:"+context.getName());
	}

}