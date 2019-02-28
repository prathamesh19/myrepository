package com.prathamesh.test.main;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.prathamesh.hibernateutil.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee(101,"prathamesh");
	
	}

}

@Entity
@Table
class Employee{
	
	@Id
	int empId;
	String empName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
}

