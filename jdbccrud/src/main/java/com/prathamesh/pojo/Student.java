package com.prathamesh.pojo;

public class Student {
int rollNo;
String studName;
public Student(int rollNo, String studName) {
	super();
	this.rollNo = rollNo;
	this.studName = studName;
}

public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", studName=" + studName + "]";
}
}
