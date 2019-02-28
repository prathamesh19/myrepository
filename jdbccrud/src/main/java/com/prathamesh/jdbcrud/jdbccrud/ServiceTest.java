package com.prathamesh.jdbcrud.jdbccrud;

import com.prathamesh.pojo.Student;
import com.prathamesh.service.StudentService;
import com.prathamesh.service.impl.StudentServiceImpl;

public class ServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1=new Student(101,"Prathamesh");
		StudentService studservice=new StudentServiceImpl();
		studservice.addStudent(st1);
		
		System.out.println("record added successfully");
	}

}
