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
import com.luv2code.springdemo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return studentService.getStudents();
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId)
	{
		return studentService.getStudent(studentId);
		
	}
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student theStudent)
	{
		theStudent.setId(0);
		studentService.saveStudent(theStudent);
		
		return theStudent;
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student theStudent)
	{
		studentService.saveStudent(theStudent);
		
		return theStudent;
		
	}
	
	@DeleteMapping("/students/{studentId}")
	public String deleteStudent(@PathVariable int studentId)
	{
		studentService.deleteStudent(studentId);
		
		return "Deleted studentId - " + studentId;
	}

	@GetMapping("/students/courses/{studentId}")
	public List<Course> getStudentCourses(@PathVariable int studentId)
	{
		return studentService.getStudentCourses(studentId);
	}
	
	@DeleteMapping("/students/courses/{courseId}/{studentId}")
	public String deleteStudentCourse(@PathVariable int courseId, @PathVariable int studentId)
	{
		studentService.deleteStudentCourse(courseId, studentId);
		
		return "Deleted courseId : " + courseId;
	}
	
	@GetMapping("/students/courses/add/{studentId}")
	public List<Course> listAddStudentCourse(@PathVariable int studentId)
	{
		return studentService.listAddStudentCourse(studentId);
	}
	
	@PostMapping("/students/courses/add/{courseId}/{studentId}")
	public String addStudentCourse(@PathVariable int courseId, @PathVariable int studentId)
	{
		studentService.addStudentCourse(courseId, studentId);
		
		return "CourseID : " + courseId + " is added to StudentID : " + studentId;
	}
	
	
}