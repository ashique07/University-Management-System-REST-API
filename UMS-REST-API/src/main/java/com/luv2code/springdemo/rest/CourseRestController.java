package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Course;
import com.luv2code.springdemo.entity.Student;
import com.luv2code.springdemo.entity.Course;
import com.luv2code.springdemo.service.CourseService;

@RestController
@RequestMapping("/api")
public class CourseRestController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable int courseId)
	{
		return courseService.getCourse(courseId);
		
	}
	
	@PostMapping("/courses")
	public Course saveCourse(@RequestBody Course theCourse)
	{
		theCourse.setId(0);
		courseService.saveCourse(theCourse);
		
		return theCourse;
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course theCourse)
	{
		courseService.saveCourse(theCourse);
		
		return theCourse;
		
	}
	
	@DeleteMapping("/courses/{courseId}")
	public String deleteCourse(@PathVariable int courseId)
	{
		courseService.deleteCourse(courseId);
		
		return "Deleted courseId - " + courseId;
	}
	
	@GetMapping("/courses/students/{courseId}")
	public List<Student> showStudents(@PathVariable int courseId)
	{
		
		return courseService.showStudents(courseId);
	}

	
}