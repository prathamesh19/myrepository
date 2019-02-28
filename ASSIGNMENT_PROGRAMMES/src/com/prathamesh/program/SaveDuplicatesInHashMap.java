package com.prathamesh.program;

import java.util.HashSet;
import java.util.Set;

public class SaveDuplicatesInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(101,"abc");
Student s2=new Student(102,"abc");
Student s3=new Student(101,"abc");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
Set s=new HashSet();
s.add(10);
s.add(10);
s.add(20);
s.add(30);
s.add(20);
System.out.println(s);

	}

}
/**
 * @author compaq
 *
 */
class Student{
	private int id;
	private String nm;
	@Override
	public String toString() {
		return "Student [id=" + id + ", nm=" + nm + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public Student(int id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
