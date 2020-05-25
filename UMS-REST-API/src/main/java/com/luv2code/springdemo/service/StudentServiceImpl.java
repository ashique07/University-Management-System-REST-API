package com.luv2code.springdemo.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CourseDAO;
import com.luv2code.springdemo.dao.StudentDAO;
import com.luv2code.springdemo.entity.Course;
import com.luv2code.springdemo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private CourseDAO courseDAO;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student theStudent) {
		
		studentDAO.saveStudent(theStudent);
		
	}

	@Override
	@Transactional
	public Student getStudent(int theId) {
		
		Student theStudent = studentDAO.getStudent(theId);
		
		return theStudent;
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		
		studentDAO.deleteStudent(id);
		
	}

	@Override
	@Transactional
	public List<Course> getStudentCourses(int studentId) {
		
		Student student = studentDAO.getStudent(studentId);
		
		List<Course> studentCourses = student.getCourses();
		
		return studentCourses;
	}

	@Override
	@Transactional
	public void deleteStudentCourse(int courseId, int studentId) {
		
		Student student = studentDAO.getStudent(studentId);
		Course course = courseDAO.getCourse(courseId);
		
		student.delete(course);
		
	}

	@Override
	@Transactional
	public List<Course> listAddStudentCourse(int studentId) {
		// TODO Auto-generated method stub
		List<Course> allCourses = courseDAO.getCourses();
		List<Course> myCourses = studentDAO.getStudent(studentId).getCourses();
		
		for(int i=0; i < allCourses.size(); i++)
		{
			for(int j = 0; j < myCourses.size(); j++)
			{
				if(allCourses.get(i).equals(myCourses.get(j)))
						{
							allCourses.remove(i);
					
						}
						
						
			}
		}
		
		return allCourses;
	}

	@Override
	@Transactional
	public void addStudentCourse(int courseId, int studentId) {
		
		Student student = studentDAO.getStudent(studentId);
		Course course = courseDAO.getCourse(courseId);
		
		student.add(course);
	}
	
}