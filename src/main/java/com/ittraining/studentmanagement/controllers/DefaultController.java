package com.ittraining.studentmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
@GetMapping("/student")
public String getstudentPage() {
return "student";
}
}