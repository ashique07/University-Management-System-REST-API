package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Course;
import com.luv2code.springdemo.entity.Instructor;

public interface InstructorDAO {
	
	public List<Instructor> getInstructors();

	public void saveInstructor(Instructor theInstructor);

	public Instructor getInstructor(int theId);

	public void deleteInstructor(int id);

}
