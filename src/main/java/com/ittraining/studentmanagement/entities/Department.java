package com.ittraining.studentmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="student_department")
public class Department {
	@javax.persistence.Id
	@GeneratedValue
	@Column(name="department_id")
	
	private Long Id;
	@Column(name="department_name",nullable=false,unique=true)
	private String departmentName;
	public Department() {
		
	}
	
	public Department( String departmentName) {
		super();
	
		this.departmentName = departmentName;
	}			

	public Long getId() {
		return Id;
	}
	public void setId(long Id) {
		this.Id = Id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

	
	
	

}
