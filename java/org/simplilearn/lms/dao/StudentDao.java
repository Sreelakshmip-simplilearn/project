package org.simplilearn.lms.dao;

import java.util.List;

import org.simplilearn.lms.entity.Student;


public interface StudentDao {
	void insert(Student student);
	List<Student> getAll();
	void delete(Student student);
	void update(Student student);
	Student get(int stid);

}
