package com.ittraining.studentmanagement.controllers;



import com.ittraining.studentmanagement.Repository.DepartmentRepository;
import com.ittraining.studentmanagement.Repository.StudentRepository;
import com.ittraining.studentmanagement.dtos.StudentDTO;
import org.springframework.web.bind.annotation.RestController;

import com.ittraining.studentmanagement.entities.Department;
import com.ittraining.studentmanagement.entities.Student;
import com.ittraining.studentmanagement.services.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
	@Autowired
        private StudentService studentservice;	
	@PostMapping("/students")
	public ResponseEntity<?> saveStudent(@RequestBody StudentDTO studentDTO){
		Student student=new Student();
                student.setFirstName(studentDTO.getFirstName());
                student.setLastName(studentDTO.getLastName());
                student.setAddress(studentDTO.getAddress());
		
                
         Department department=departmentRepository.findByDepartmentName(studentDTO.getDepartmentName());
	student.setDepartment(department);
        studentRepository.save(student);
        return ResponseEntity.ok("new record saved");
        }
        @GetMapping("/students")
        public ResponseEntity<?>getAllStudents(){
        List<Student> studentList= studentRepository.findAll();
        return ResponseEntity.ok(studentList);
        
        }
        @PutMapping("/students")
        public ResponseEntity<?> deleteStudent(@RequestParam Long studentId,@RequestBody StudentDTO dto){
       Student oldStudent=studentRepository.findOne(studentId);
       oldStudent.setAddress(dto.getAddress());
       oldStudent.setFirstName(dto.getFirstName());
       oldStudent.setLastName(dto.getLastName());
        return ResponseEntity.ok("Updated");
          }
        @DeleteMapping
        public ResponseEntity<?>deleteStudents(@RequestParam Long studentId){
       studentRepository.delete(studentId);
       return ResponseEntity.ok("students deleted");
}
        @GetMapping(value="/students/export")
        public ResponseEntity<?> exportCsv() {

        return ResponseEntity.ok(studentservice.getCsv());
        }
}
