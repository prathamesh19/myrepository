package com.prathamesh.service.impl;

import com.prathamesh.pojo.Student;
import com.prathamesh.service.StudentService;
import com.prathamesh.util.JdbcAppUtil;

public class StudentServiceImpl implements StudentService{

	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		
		JdbcAppUtil.getJdbcConnection("INSERT INTO STUDENT_INFO VALUES"+"("+student.getRollNo()+","+"'"+student.getStudName()+"'"+")");
		
		return false;
	}

}
