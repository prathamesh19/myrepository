package com.scp.testlogin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// create Workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// create sheet
		XSSFSheet sheet = workbook.createSheet(); 
	
		
		// Creating row
		Row row1=sheet.createRow(0);
		Cell cell1=row1.createCell(0);
		cell1.setCellValue("abc");
		Cell cell2=row1.createCell(1);
		cell2.setCellValue("abc123");
		
		Row row2=sheet.createRow(1);
		Cell cell3=row2.createCell(0);
		cell3.setCellValue("abc123");
		Cell cell4=row2.createCell(1);
		cell4.setCellValue("abc");
		
		/*sheet.createRow(0).createCell(0).setCellValue("abc");
		sheet.createRow(0).createCell(1).setCellValue("abc123");
		sheet.createRow(1).createCell(0).setCellValue("abc123");
		sheet.createRow(1).createCell(1).setCellValue("abc");*/
		// Writing to file
		File file = new File("C:\\Users\\compaq\\workspace_Neon\\CRUD_and_TestNG\\src\\test\\resource\\user.xlsx");
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		out.close();
		
		System.out.println("file written successfully");
	}

}
