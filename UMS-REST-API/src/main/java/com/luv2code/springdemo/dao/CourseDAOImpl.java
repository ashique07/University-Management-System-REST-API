package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Course;
import com.luv2code.springdemo.entity.Instructor;
import com.luv2code.springdemo.entity.Student;

@Repository
public class CourseDAOImpl implements CourseDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Course> theQuery = currentSession.createQuery("from Course",Course.class);
		
		List<Course> courses = theQuery.getResultList();
		
		return courses;
	}

	@Override
	public void saveCourse(Course theCourse) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		/*
		 * saveOrUpdate(theCourse)
		 * if(primaryKey/ID) empty
		 * THEN SAVE Course
		 * ELSE UPDATE existing Course
		 */
		
		currentSession.saveOrUpdate(theCourse);
		
	}

	@Override
	public Course getCourse(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Course theCourse = currentSession.get(Course.class,theId);
		
		return theCourse;
	}

	@Override
	public void deleteCourse(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.createQuery("delete from Course where id=" + id).executeUpdate();
	}

	@Override
	public Instructor getInstructor(int courseId) {
		// TODO Auto-generated method stub
		
		Instructor instructor = getCourse(courseId).getInstructor();
		
		return instructor;
	}

	@Override
	public List<Course> listAddInstructorCourse() {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		List<Course> courses = currentSession.createQuery("from Course c where c.instructor=" + null).getResultList();
		
		return courses;
	}

	@Override
	public List<Student> getStudents(int studentId) {
		
		List<Student> students = getCourse(studentId).getStudents();
		
		return students;

	}

}