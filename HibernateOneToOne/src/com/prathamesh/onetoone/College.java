package com.prathamesh.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
public class College {

	@Id
	private int collegeId;
	private String collegeName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Student student;
}
