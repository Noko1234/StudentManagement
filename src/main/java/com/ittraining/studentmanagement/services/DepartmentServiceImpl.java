/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ittraining.studentmanagement.services;


import com.ittraining.studentmanagement.Repository.DepartmentRepository;
import com.ittraining.studentmanagement.dtos.DepartmentDTO;
import com.ittraining.studentmanagement.dtos.StudentDTO;
import com.ittraining.studentmanagement.entities.Department;
import com.ittraining.studentmanagement.entities.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noko
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public List<DepartmentDTO> findAllDepartments() {
        List<Department> departmentList=departmentRepository.findAll();
        return departmentList
                .stream()
                .map(departmentDTOConverter)
                .collect(Collectors.toList());
        
   }
    private Function<Department,DepartmentDTO> departmentDTOConverter=(d)->{
       DepartmentDTO dto= new DepartmentDTO();
       dto.setDepartmentId(d.getDepartmentId());
       dto.setDepartmentName(d.getDepartmentName());
       List<StudentDTO> studentList = new ArrayList<>();
       for(Student s: d.getStudentList()){
           StudentDTO stdDTO= new StudentDTO();
           stdDTO.setFirstName(s.getFirstName());
           stdDTO.setLastName(s.getLastName());
           stdDTO.setAddress(s.getAddress());
           studentList.add(stdDTO);
      }
       dto.setStudentList(studentList);
       return dto;
   }; 

   @Override
   public List<String> findAllDepartNames(){
       return departmentRepository.findAll().stream().map(d ->d.getDepartmentName()).collect(Collectors.toList());
       
   }
   

   
}