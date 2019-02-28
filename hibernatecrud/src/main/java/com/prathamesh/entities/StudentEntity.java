package com.prathamesh.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Entity:  add fields----annotate them
 *          + getters and setters
 *          + contructor (default + parametererized)
 *          + toString()
 * 
 * @author prathamesh
 *
 */



@Entity
@Table(name= "Student_Assignment")
public class StudentEntity {

		@Id
	    @Column(name="stud_id")
	    private int studId;

		@Column(name="stud_username")
		private String studUserName;
		
		@Column(name="stud_password")
		private String studPassword;
		
		@Column(name="stud_isActive")
		private String isActive;
		
	public StudentEntity() {
			super();
			// TODO Auto-generated constructor stub
		}

	public StudentEntity(int studId, String studUserName, String studPassword, String isActive) {
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

		public String getIsActive() {
			return isActive;
		}

		public void setIsActive(String isActive) {
			this.isActive = isActive;
		}

	@Override
		public String toString() {
			return "StudentEntity [studId=" + studId + ", studUserName=" + studUserName + ", studPassword="
					+ studPassword + ", isActive=" + isActive + "]";
		}

	

	
}
