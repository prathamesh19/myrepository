package com.prathamesh.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class I {

	
	@Test
	public void testCase1(){
		Assert.assertEquals("gg", "gg");
		System.out.println("I-----Test Case 1");
	}
	
	@Test
	public void testCase2(){
		Assert.assertEquals("jj", "ji");
		System.out.println("I----Test Case 2");
	}
}
