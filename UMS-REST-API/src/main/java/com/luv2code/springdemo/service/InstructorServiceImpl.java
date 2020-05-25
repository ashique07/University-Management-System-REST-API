package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CourseDAO;
import com.luv2code.springdemo.dao.InstructorDAO;
import com.luv2code.springdemo.entity.Course;
import com.luv2code.springdemo.entity.Instructor;

@Service
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private InstructorDAO instructorDAO;
	@Autowired
	private CourseDAO courseDAO;
	
	@Override
	@Transactional
	public List<Instructor> getInstructors() {
		
		return instructorDAO.getInstructors();
	}

	@Override
	@Transactional
	public void saveInstructor(Instructor theInstructor) {
		
		instructorDAO.saveInstructor(theInstructor);
		
	}

	@Override
	@Transactional
	public Instructor getInstructor(int theId) {
		
		Instructor theInstructor = instructorDAO.getInstructor(theId);
		
		return theInstructor;
	}

	@Override
	@Transactional
	public void deleteInstructor(int id) {
		
		instructorDAO.deleteInstructor(id);
		
	}

	@Override
	@Transactional
	public List<Course> getInstructorCourses(int instructorId) {
		
		Instructor instructor = instructorDAO.getInstructor(instructorId);
		
		List<Course> instructorCourses = instructor.getCourses();
		
		return instructorCourses;
	}

	@Override
	@Transactional
	public void deleteInstructorCourse(int courseId) {
		
		Instructor instructor = courseDAO.getInstructor(courseId);
		Course course = courseDAO.getCourse(courseId);
		
		instructor.delete(course);
		
	}

	@Override
	@Transactional
	public List<Course> listAddInstructorCourse() {
		// TODO Auto-generated method stub
		return courseDAO.listAddInstructorCourse();
	}

	@Override
	@Transactional
	public void addInstructorCourse(int courseId, int instructorId) {
		
		Instructor instructor = instructorDAO.getInstructor(instructorId);
		Course course = courseDAO.getCourse(courseId);
		
		instructor.add(course);
	}
	
}