package org.simplilearn.lms.dao;

import java.util.List;

import org.simplilearn.lms.entity.Teacher;

public interface TeacherDao {
	void insert(Teacher teacher);
	List<Teacher> getAll();
	Teacher get(String Name);
	void delete(Teacher teacher);
	void update(Teacher teacher);
	Teacher get(int tid);

}
