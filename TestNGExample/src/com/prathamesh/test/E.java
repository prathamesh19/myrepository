package com.prathamesh.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class E {

	@Test(dataProvider="MyData1")
	public void testCase1(String username, String password){
		System.out.println("This is the test case corresponding to DataProvider");
		System.out.println("Username= " +username);
		System.out.println("Password= " +password);
	}
	
	
	
	@DataProvider(name="MyData1")
	public String[][] dataProviderMethod(){
		String [][] obj=new String [4][2]; // 4 users 
		obj[0][0]="user1";
		obj[0][1]="pwd1";
		obj[1][0]="user2";
		obj[1][1]="pwd2";
		obj[2][0]="user3";
		obj[2][1]="pwd3";
		obj[3][0]="user4";
		obj[3][1]="pwd4";
		return obj;
	}
}
