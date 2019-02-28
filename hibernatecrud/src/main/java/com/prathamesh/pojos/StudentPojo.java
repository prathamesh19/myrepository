package com.prathamesh.pojos;


/**
 * Pojo class: add only fields
 *             + getters/setters
 *             + constructor (default + parameterized)
 *             + toString()
 * 
 * @author prathamesh
 *
 */



public class StudentPojo {

	private int studId;
	private String studUserName;
	private String studPassword;
	private boolean isActive;
	public StudentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentPojo(int studId, String studUserName, String studPassword, boolean isActive) {
		super();
		this.studId = studId;
		this.studUserName = studUserName;
		this.studPassword = studPassword;
		this.isActive = isActive;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudUserName() {
		return studUserName;
	}
	public void setStudUserName(String studUserName) {
		this.studUserName = studUserName;
	}
	public String getStudPassword() {
		return studPassword;
	}
	public void setStudPassword(String studPassword) {
		this.studPassword = studPassword;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "StudentPojo [studId=" + studId + ", studUserName=" + studUserName + ", studPassword=" + studPassword
				+ ", isActive=" + isActive + "]";
	}
	

}
