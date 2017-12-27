            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ittraining.studentmanagement.dtos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Noko
 */
public class DepartmentDTO {
    private Long departmentId;
    private String departmentName;
    private int size;
    private List<StudentDTO> studentList=new ArrayList<>();

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<StudentDTO> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentDTO> studentList) {
        this.studentList = studentList;
    }

    public int getSize() {
        
        this.size=studentList.size();
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
    

