package com.prathamesh.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class D {

	@Test
	@Parameters(value={"Username","Password"})
	public void authenticate(String username, String password){
		System.out.println("Your Username Is : " + username);
		System.out.println("Your Password Is :" + password);
	}
}
