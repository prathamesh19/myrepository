package com.prathamesh.jdbctest.testjdbc;

import com.prathamesh.pojo.Student;
import com.prathamesh.service.StudentService;
import com.prathamesh.service.impl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student st1=new Student(101,"Prathamesh");
		StudentService studservice=new StudentServiceImpl();
		studservice.addStudent(st1);
		
		System.out.println("record added successfully");
    }
}
