package com.htc.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListerners implements ITestListener {

	public void onTestStart(ITestResult result) {
	System.out.println("TestCases start and details are"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases Success and details are"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases failed and details are"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases Skipped and details are"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("TestCases failed and details are"+result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("Testcase Starts"+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Testcase Finish"+context.getName());
		
	}
	
	

}
