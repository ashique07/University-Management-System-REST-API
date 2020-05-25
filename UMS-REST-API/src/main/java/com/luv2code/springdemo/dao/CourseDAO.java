package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Course;
import com.luv2code.springdemo.entity.Instructor;
import com.luv2code.springdemo.entity.Student;

public interface CourseDAO {
	
	public List<Course> getCourses();

	public void saveCourse(Course theCourse);

	public Course getCourse(int theId);

	public void deleteCourse(int id);

	public Instructor getInstructor(int courseId);

	public List<Course> listAddInstructorCourse();

	public List<Student> getStudents(int courseId);
	

}
