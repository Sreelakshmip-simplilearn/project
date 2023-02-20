package org.simplilearn.lms.dao;

import java.util.List;

import org.simplilearn.lms.entity.AcademicClass;


public interface AcademicClassDao {
	void insert(AcademicClass academicclass);
	List<AcademicClass> getAll();
	void delete(AcademicClass academicclass);
	void update(AcademicClass academicclass);
	AcademicClass get(int cid);

}
