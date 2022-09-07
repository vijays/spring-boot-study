// Implementing CourseService interface

package com.vijays.springbootstudy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vijays.springbootstudy.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> courseList ;
	

	// Dataset of courses
	public CourseServiceImpl() {

		courseList = new ArrayList<>();
		courseList.add(new Course(100, "Programming")) ;
		courseList.add(new Course(101, "Database")) ;
		courseList.add(new Course(102, "Networking")) ;

	}



	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseList;
	}

}
