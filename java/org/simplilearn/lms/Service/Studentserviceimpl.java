package org.simplilearn.lms.Service;

import org.simplilearn.lms.dao.StudentDao;
import org.simplilearn.lms.dao.StudentDaoimpl;
import org.simplilearn.lms.entity.Student;

public class Studentserviceimpl implements Studentservice{
	StudentDao Dao=new StudentDaoimpl();
	@Override
	public void deletestudent(Student student) {
		Dao.delete(student);
		
	}
	@Override
	public void studentClass(Student student) {
		Dao.update(student);
		
	}

}
