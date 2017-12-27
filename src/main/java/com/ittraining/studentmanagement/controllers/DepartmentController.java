package com.ittraining.studentmanagement.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ittraining.studentmanagement.Repository.DepartmentRepository;
import com.ittraining.studentmanagement.entities.Department;
import com.ittraining.studentmanagement.services.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentRepository departmentRepository;
        @Autowired
        private DepartmentService departmentService;//object created of depaerment service
@PostMapping("/departments")
public ResponseEntity<?> saveDepartment(@RequestBody Department department){//front end
	departmentRepository.save(department);
	return ResponseEntity.ok("New Record saved");
}
@GetMapping("/departments")
public ResponseEntity<?>getALLDepartments(){
	//List<Department>departmentlist=departmentRepository.findAll();
	return ResponseEntity.ok(departmentService.findAllDepartments());
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
@GetMapping("/departments/names")
public ResponseEntity<?>getAllDepartnames(){
return ResponseEntity.ok(departmentService.findAllDepartNames());
}
}
