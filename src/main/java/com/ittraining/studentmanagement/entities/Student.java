//package com.ittraining.studentmanagement.entities;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//@Entity
//public class Student {
//	
//	private long StudentId;
//	private String firstName;
//	
//	private String lastName;
//	    @Id
//	    @GeneratedValue
//	    @Column
//	   
//	    @JoinColumn(name = "department_id")
//	    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	    private Department department;
//
//	    public Long getStudentId() {
//	        return StudentId;
//	    }
//
//	    public void setId(Long id) {
//	        this.StudentId = id;
//	    }
//
//	    public String getFirstName() {
//	        return firstName;
//	    }
//
//	    public void setFirstName(String firstName) {
//	        this.firstName = firstName;
//	    }
//
//	    public String getLastName() {
//	        return lastName;
//	    }
//
//	    public void setLastName(String lastName) {
//	        this.lastName = lastName;
//	    }
//
//	    public Department getDepartment() {
//	        return department;
//	    }
//
//	    public void setDepartment(Department department) {
//	        this.department = department;
//	    }
//	    
//	}