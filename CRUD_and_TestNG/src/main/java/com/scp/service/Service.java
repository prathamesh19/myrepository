package com.scp.service;

import com.scp.entities.EmployeeInfo;

public interface Service {

	boolean addEmployee(EmployeeInfo emp);
	EmployeeInfo getEmployeeInfo(int id);
}
