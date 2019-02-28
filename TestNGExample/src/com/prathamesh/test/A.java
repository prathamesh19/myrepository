package com.prathamesh.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {

	@Test
	public void testCase1(){
		System.out.println("A-----Test Case 1");
	}
	
	@Test
	public void testCase2(){
		System.out.println("A-----Test Case 2");
	}
	
	@Test
	public void testCase3(){
		System.out.println("A-----Test Case 3");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("A----Before Test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("A----After Test");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("A----Before Method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("A----After Method");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("A-----Before Class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("A-----After Class");
	}
	
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("A-----Before Suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("A------After Suite");
	}
	
	@AfterGroups
	public void afterGroups(){
		System.out.println("A-----After Groups");
	}
	
	@BeforeGroups
	public void beforeGroups(){
		System.out.println("A-----Before Groups");
	}
	
	
	@Test(dependsOnMethods={"testCase2"})
	public void dependsOnTestCase2(){
		System.out.println("A-----This Test Case Depends On Test Case 2");
	}
	
	@Test(enabled=true)
	public void enabledMethod(){
		System.out.println("A-----This Test case is Enabled");
	}
	
	@Test(enabled=false)
	public void disabledMethod(){
		System.out.println("A-----This Test case is Disabled");
	}
	
	@Test
	public void assertedMethod(){
		Assert.assertEquals(false, true);
		System.out.println("A-----assert equals test case");
	}
	
}
