/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ittraining.studentmanagement.services;

import com.ittraining.studentmanagement.dtos.DepartmentDTO;
import java.util.List;

/**
 *
 * @author Noko
 */
public interface DepartmentService {
   
    List<DepartmentDTO> findAllDepartments();
   List<String> findAllDepartNames(); 
}