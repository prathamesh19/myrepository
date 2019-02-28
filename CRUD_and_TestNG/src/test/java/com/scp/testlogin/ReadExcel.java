package com.scp.testlogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		
			File f=new File("C:\\Users\\compaq\\workspace_Neon\\CRUD_and_TestNG\\src\\test\\resource\\user.xlsx");
			FileInputStream file = new FileInputStream(f);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);

	      
}
}