package com.prathamesh.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class G {

	@Test
	public void testCase1(){
		Assert.assertEquals("Hii", "Hii");
		System.out.println("G----Test Case 1");
	}
	
	@Test
	public void testCase2(){
		Assert.assertEquals("Hii", "Hello");
		System.out.println("G----Test Case 2");
	}
}
