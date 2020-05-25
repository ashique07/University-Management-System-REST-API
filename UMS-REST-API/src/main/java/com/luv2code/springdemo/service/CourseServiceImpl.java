package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CourseDAO;
import com.luv2code.springdemo.entity.Course;
import com.luv2code.springdemo.entity.Student;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDAO courseDAO;
	
	@Override
	@Transactional
	public List<Course> getCourses() {
		
		return courseDAO.getCourses();
	}

	@Override
	@Transactional
	public void saveCourse(Course theCourse) {
		
		courseDAO.saveCourse(theCourse);
		
	}

	@Override
	@Transactional
	public Course getCourse(int theId) {
		
		Course theCourse = courseDAO.getCourse(theId);
		
		return theCourse;
	}

	@Override
	@Transactional
	public void deleteCourse(int id) {
		
		courseDAO.deleteCourse(id);
		
	}

	@Override
	@Transactional
	public List<Student> showStudents(int courseId) {
		
		List<Student> students = courseDAO.getCourse(courseId).getStudents();
		
		return students;
	}
	
}