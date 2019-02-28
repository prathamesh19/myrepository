package com.prathamesh.student.service;

import java.util.HashMap;
import java.util.List;

import com.prathamesh.constants.AppLevelConstants;
import com.prathamesh.pojos.StudentPojo;


/**
 * Student Service contract:  add methods
 * 
 * @author prathamesh
 *
 */
public interface StudentService {

	public boolean addStudent(StudentPojo stud);
	public boolean deleteStudent(int studId);
	public StudentPojo getStudent(int studId);
	public boolean updateStudent(StudentPojo stud);
	public List<StudentPojo> getAllStudents();
	public List<StudentPojo> searchStudent(HashMap<AppLevelConstants.StudFields,String> searchCriteria);
}			

/**

//view
!
! Controller -- 
!
!     (Class)	(Interface)	(class)			(Inteface)	(class)
//EmpFlow -- service -- serviceImpl --dao--daoimpl
//EmpController -- ServiceImpl -- DaoImpl
--		Pojo	---        pojoEntity  ---- Dao
							entityToPojo
//InvoiceController -- ServiceImpl -- DaoImpl
}


MVC  -- Model -- java classes
	view -- UI
	controller 
*/


