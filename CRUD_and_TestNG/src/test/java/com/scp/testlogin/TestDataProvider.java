package com.scp.testlogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.bind.ValidationException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.scp.entities.EmployeeInfo;
import com.scp.service.Service;
import com.scp.serviceimpl.ServiceImpl;

public class TestDataProvider {

	 @DataProvider(name="credentials")
	  public static Object[][] credentials() throws IOException {
		 File f=new File("C:\\Users\\compaq\\workspace_Neon\\CRUD_and_TestNG\\src\\test\\resource\\user.xlsx");
			FileInputStream file = new FileInputStream(f);
			
			//loading workbook
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// loading sheet
			XSSFSheet sheet = workbook.getSheetAt(0);
		 Object [][] strarr=new String [2][2];
		strarr[0][0]=sheet.getRow(0).getCell(0).getStringCellValue();
		strarr[0][1]=sheet.getRow(0).getCell(1).getStringCellValue();
		strarr[1][0]=sheet.getRow(1).getCell(0).getStringCellValue();
		strarr[1][1]=sheet.getRow(1).getCell(1).getStringCellValue();
		 
	        return strarr;
	 
	  }
	
	 @Test(dataProvider = "credentials")
	 public static void authenticate(String un, String pwd) throws ValidationException, IOException{
		 Service service=new ServiceImpl();
			EmployeeInfo e3=service.getEmployeeInfo(10);
			String actualUsername=e3.getEmpUsername();
			String actualPassword=e3.getEmpPassword();

			Object [][] arr=new String [1][2];
			arr[0][0]=e3.getEmpUsername();
			arr[0][1]=e3.getEmpPassword();
			
			 System.out.println("UserName: "+ un);
		       System.out.println("PassWord: "+ pwd);
	 }
	 
	
}

