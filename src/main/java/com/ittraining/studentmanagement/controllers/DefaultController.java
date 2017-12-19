package com.ittraining.studentmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ittraining.studentmanagement.entities.Department;

@Controller
//rest -home return
public class DefaultController {

@GetMapping(value= {"/home","/"})
public String getHomePage() {
return "home";
}
@GetMapping("/department")
public String getDepartmentPage() {
return "department";
}
@GetMapping("/about")
public String getAboutPage() {
return "about";
}
}
