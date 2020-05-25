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

@Repository
public class InstructorDAOImpl implements InstructorDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Instructor> getInstructors() {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Instructor> theQuery = currentSession.createQuery("from Instructor",Instructor.class);
		
		List<Instructor> instructors = theQuery.getResultList();
		
		return instructors;
	}

	@Override
	public void saveInstructor(Instructor theInstructor) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		/*
		 * saveOrUpdate(theInstructor)
		 * if(primaryKey/ID) empty
		 * THEN SAVE Instructor
		 * ELSE UPDATE existing Instructor
		 */
		
		currentSession.saveOrUpdate(theInstructor);
		
	}

	@Override
	public Instructor getInstructor(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Instructor theInstructor = currentSession.get(Instructor.class,theId);
		
		return theInstructor;
	}

	@Override
	public void deleteInstructor(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.createQuery("delete from Instructor where id=" + id).executeUpdate();
	}


}