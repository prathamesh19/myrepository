package com.prathamesh.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class F implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("F---Test Case is Passed   "+ result.getClass() + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("F-----Test Case is Failed   "+ result.getClass()+ result.getName());
		System.out.println("Error--" + result.getThrowable());
		
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
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
