package org.simplilearn.lms.dao;

import java.util.List;


import org.simplilearn.lms.entity.Subject;


public interface SubjectDao {
	void insert(Subject subject);
	List<Subject> getAll();
	void delete(Subject subject);
	void update(Subject subject);
	Subject get(int sid);

}
