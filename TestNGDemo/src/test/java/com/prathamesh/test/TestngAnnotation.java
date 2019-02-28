package com.prathamesh.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngAnnotation {


	   public void tescase1() {
	      System.out.println("in test case 1");
	   }
	   
	   @Test
	   public void testCase2(){
		   System.out.println("in test case 2");
	   }
	   
	   @BeforeMethod
	   public void testCase3(){
		   System.out.println("in test case 3");
	   }
	   
	   @BeforeMethod
	   public void testCase4(){
		   System.out.println("in test case 4");
	   }
}