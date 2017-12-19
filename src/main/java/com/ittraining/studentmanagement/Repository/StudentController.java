//package com.ittraining.studentmanagement.Repository;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.ittraining.studentmanagement.entities.Department;
//import com.ittraining.studentmanagement.entities.Student;
//
//@RestController
//public class StudentController {
//	@Autowired
//	//private StudentRepository studentRepository;
//	@PostMapping("/students")
//	public ResponseEntity<?> saveStudent(@RequestBody Student student){//front end
//		//StudentRepository.save(student);
//		return ResponseEntity.ok("New Record saved");
//	}
//	@GetMapping("/students")
//	public ResponseEntity<?>getALLStudents(){
//		//List<Student>studentlist=StudentRepository.findAll();
//		//return ResponseEntity.ok(studentlist);
//	}
//	@Transactional
//	//("/students")
//	public ResponseEntity<?> updateStudent(@RequestParam  Long StudentId,
//			@RequestBody Student student){
//	     //Student oldstudent= studentRepository.findOne(StudentId);
//		//oldStudent.setfirstName(student.getfirstName());
//	return ResponseEntity.ok("first name updated");	
//	}
//	public ResponseEntity<?> deleteStudent(@RequestParam Long studentId){
//       //studentRepository.delete(StudentId);
//		return ResponseEntity.ok("Student deleted");
//		
//	}
//	}
//
//	
//	
//
//
