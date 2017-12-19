package com.ittraining.studentmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ittraining.studentmanagement.Repository.DepartmentRepository;
import com.ittraining.studentmanagement.entities.Department;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentRepository departmentRepository;
@PostMapping("/departments")
public ResponseEntity<?> saveDepartment(@RequestBody Department department){//front end
	departmentRepository.save(department);
	return ResponseEntity.ok("New Record saved");
}
@GetMapping("/departments")
public ResponseEntity<?>getALLDepartments(){
	List<Department>departmentlist=departmentRepository.findAll();
	return ResponseEntity.ok(departmentlist);
}
@Transactional
@PutMapping("/departments")
public ResponseEntity<?> updateDepartment(@RequestParam  Long departmentId,
		@RequestBody Department department){
	Department oldDepartment= departmentRepository.findOne(departmentId);
	oldDepartment.setDepartmentName(department.getDepartmentName());
return ResponseEntity.ok("department updated");	
}
@DeleteMapping("/departments")
public ResponseEntity<?> deleteDepartment(@RequestParam Long departmentId){
	departmentRepository.delete(departmentId);
	return ResponseEntity.ok("department deleted");
	
}
}
