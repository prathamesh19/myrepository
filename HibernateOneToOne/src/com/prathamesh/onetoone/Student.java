package com.prathamesh.onetoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
@Table
public class Student {

	@Id
	private int studentId;
	private String studentName;
	@ElementCollection
	private List<College> listOfColleges=new ArrayList();
}
