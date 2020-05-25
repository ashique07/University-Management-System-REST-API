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
import com.luv2code.springdemo.entity.Instructor;
import com.luv2code.springdemo.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorRestController {
	
	@Autowired
	private InstructorService instructorService;
	
	@GetMapping("/instructors")
	public List<Instructor> getInstructors()
	{
		return instructorService.getInstructors();
	}
	
	@GetMapping("/instructors/{instructorId}")
	public Instructor getInstructor(@PathVariable int instructorId)
	{
		return instructorService.getInstructor(instructorId);
		
	}
	
	@PostMapping("/instructors")
	public Instructor saveInstructor(@RequestBody Instructor theInstructor)
	{
		theInstructor.setId(0);
		instructorService.saveInstructor(theInstructor);
		
		return theInstructor;
	}
	
	@PutMapping("/instructors")
	public Instructor updateInstructor(@RequestBody Instructor theInstructor)
	{
		instructorService.saveInstructor(theInstructor);
		
		return theInstructor;
		
	}
	
	@DeleteMapping("/instructors/{instructorId}")
	public String deleteInstructor(@PathVariable int instructorId)
	{
		instructorService.deleteInstructor(instructorId);
		
		return "Deleted instructorId - " + instructorId;
	}

	@GetMapping("/instructors/courses/{instructorId}")
	public List<Course> getInstructorCourses(@PathVariable int instructorId)
	{
		return instructorService.getInstructorCourses(instructorId);
	}
	
	@DeleteMapping("/instructors/courses/{courseId}")
	public String deleteInstructorCourse(@PathVariable int courseId)
	{
		instructorService.deleteInstructorCourse(courseId);
		
		return "Deleted courseId - " + courseId;
	}
	
	@GetMapping("/instructors/courses/add")
	public List<Course> listAddInstructorCourse()
	{
		return instructorService.listAddInstructorCourse();
	}
	
	@PostMapping("/instructors/courses/add/{courseId}/{instructorId}")
	public String addInstructorCourse(@PathVariable int courseId,@PathVariable int instructorId)
	{
		instructorService.addInstructorCourse(courseId, instructorId);
		
		return "CourseID : " + courseId + " is added to InstructorID : " + instructorId;
	}
	
	
}