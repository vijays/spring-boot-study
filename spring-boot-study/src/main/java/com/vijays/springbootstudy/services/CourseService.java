// Implementing loose coupling using Interface

package com.vijays.springbootstudy.services;

import java.util.List;

import com.vijays.springbootstudy.entities.Course;

public interface CourseService {

	public List<Course> getCourses() ;
}
