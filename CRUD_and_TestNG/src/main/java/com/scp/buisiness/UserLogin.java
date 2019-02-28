package com.scp.buisiness;

import javax.xml.bind.ValidationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.scp.entities.EmployeeInfo;
import com.scp.service.Service;
import com.scp.serviceimpl.ServiceImpl;

public class UserLogin {

	public static void authenticate(String un, String pwd) throws ValidationException{
		Service service=new ServiceImpl();
		EmployeeInfo e3=service.getEmployeeInfo(10);
		String actualUsername=e3.getEmpUsername();
		String actualPassword=e3.getEmpPassword();
	
		if((null==actualUsername)||(null==actualPassword)){
			throw new ValidationException("Username and password cannot be null");
		}
		if(un.equals("")||pwd.equals("")){
			throw new ValidationException("Username and password cannot be empty");
		}
		if(actualUsername.equals(un) && actualPassword.equals(pwd)){
			System.out.println("Login Successfull !");
		}
		else{
			throw new ValidationException("Invalid Credentials");
		}
		}
}
