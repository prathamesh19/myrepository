package com.scp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeInfo {

@Id
int empId;

String empUsername;
String empPassword;
public EmployeeInfo() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeInfo(int empId, String empUsername, String empPassword) {
	super();
	this.empId = empId;
	this.empUsername = empUsername;
	this.empPassword = empPassword;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpUsername() {
	return empUsername;
}
public void setEmpUsername(String empUsername) {
	this.empUsername = empUsername;
}
public String getEmpPassword() {
	return empPassword;
}
public void setEmpPassword(String empPassword) {
	this.empPassword = empPassword;
}
@Override
public String toString() {
	return "EmployeeInfo [empId=" + empId + ", empUsername=" + empUsername + ", empPassword=" + empPassword + "]";
}
}
