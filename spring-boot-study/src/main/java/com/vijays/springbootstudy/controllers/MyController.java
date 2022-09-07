package com.vijays.springbootstudy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijays.springbootstudy.entities.Course;
import com.vijays.springbootstudy.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	public CourseService courses ;
	
	@GetMapping ("/home")
	public String home() {
		return "Welcome to home page!" ;
	}

	@GetMapping ("/courses")
	public List<Course> getCourses() {
		return this.courses.getCourses() ;
	}
}
