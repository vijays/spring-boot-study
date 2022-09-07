package com.vijays.springbootstudy.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijays.springbootstudy.entities.Course;

@RestController
public class MyController {
	
	@GetMapping ("/home")
	public String home() {
		return "Welcome to home page!" ;
	}

	@GetMapping ("/courses")
	public List<Course> getCourses() {
		
	}
}
