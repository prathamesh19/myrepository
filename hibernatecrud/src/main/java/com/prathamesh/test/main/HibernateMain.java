package com.prathamesh.test.main;

import java.util.HashMap;
import java.util.List;

import com.prathamesh.constants.AppLevelConstants;
import com.prathamesh.pojos.StudentPojo;
import com.prathamesh.student.service.StudentService;
import com.prathamesh.student.service.impl.StudentServiceImpl;

public class HibernateMain {

	public static void main(String[] args) {
		
	
	StudentPojo student1 = new StudentPojo(10, "admin","admin123", true);
	
	StudentService studentService = new StudentServiceImpl();

	for(int i =1;i<=10;i++){	
	boolean isAdded =  studentService.addStudent (new StudentPojo(i, "admin"+i,"admin123", true));
	System.out.println("-------------------SAVE---------------------------------");
	System.out.println("Is Student Addedd " + isAdded);
	}
	
	
	System.out.println("----------------------GET------------------------------");
	StudentPojo pojoFrmDb = studentService.getStudent(10);
	System.out.println("DBPojo -- " + pojoFrmDb);
	System.out.println("----------------------GETLIST------------------------------");
	List<StudentPojo> listofPojos = studentService.getAllStudents();
	System.out.println("ListOf-- DBPojo -- " + listofPojos);
	
	HashMap<AppLevelConstants.StudFields, String> hmap = new HashMap<AppLevelConstants.StudFields, String>();
	hmap.put(AppLevelConstants.StudFields.studId, "1");
	hmap.put(AppLevelConstants.StudFields.isActive, "Yes");
	
	listofPojos = studentService.searchStudent(hmap);
	System.out.println("WithSearchCriteria" + listofPojos);
	
}
}
