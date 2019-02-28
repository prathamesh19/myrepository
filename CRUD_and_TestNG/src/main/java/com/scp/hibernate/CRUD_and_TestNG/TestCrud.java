package com.scp.hibernate.CRUD_and_TestNG;

import java.io.IOException;

import javax.xml.bind.ValidationException;

import com.scp.buisiness.UserLogin;
import com.scp.entities.EmployeeInfo;
import com.scp.service.Service;
import com.scp.serviceimpl.ServiceImpl;

public class TestCrud {

	public static void main(String[] args) throws IOException, ValidationException {
		
      EmployeeInfo e1=new EmployeeInfo(10,"abc","abc123");
      
        Service service=new ServiceImpl();
//        service.addEmployee(e1);
        UserLogin.authenticate("abc", " ");

	}


}

