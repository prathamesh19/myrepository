package com.prathamesh.student.buisiness;

import java.util.List;

import com.prathamesh.constants.AppLevelConstants;
import com.prathamesh.pojos.StudentPojo;
import com.prathamesh.student.service.StudentService;
import com.prathamesh.student.service.impl.StudentServiceImpl;

public class StudentController {

	public String validateUserCredentails(String username, String password) {
		String dbUserName = null;
		String dbPassword = null;
		try {
			StudentService service = new StudentServiceImpl();
			List<StudentPojo> students = service.getAllStudents(); // make sure
																	// one
																	// record is
																	// there--
																	// for now
																	// consider
																	// this as
																	// an
																	// assumption
			for (StudentPojo studPojo : students) {
				dbUserName = studPojo.getStudUserName();
				dbPassword = studPojo.getStudPassword();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (dbUserName == null) {
				dbUserName = "";
			}
			if (dbPassword == null) {
				dbPassword = "";
			}
		}

		if (username == null) {
			return AppLevelConstants.USERNAME_CANNOT_BE_EMPTY;
		} else if (password == null) {
			return AppLevelConstants.PASSWORD_CANNOT_BE_EMPTY;
		} else if (dbUserName.equals(username) && dbPassword.equals(password)) {
			return AppLevelConstants.LOGIN_SUCCESS;
		}
		return AppLevelConstants.INVALID_USERNAME_PASSWORD;
	}

}

/**
 * as a dependency -- child la build kel -- parent build hot nah -- it will just
 * refer from repo parent build -- then child kara
 * 
 * 
 * as a parent -- if you build build child proj -- automatically parent project
 * adhi build hoel -- jar -- repo -- child latest jar refer karel
 * 
 * Maven build life cycle Maven Commads
 * 
 * TestNG JfreeChart TestNG -- Reporting -- Customize Reporting -- maven build
 * multiple ways--
 * 
 * 
 * 
 * EmpService -- Contract EmpServiceimpl -- Hibernate -- SingleToneDesignpattern
 * Hibernate Crud TestNG Test Case DataProvider ExcelReadwrite Maven build
 * process
 * 
 * Projectone -- Hibernate Crud 
 * ProjectTwo -- BusinessLogic/TestCase
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */