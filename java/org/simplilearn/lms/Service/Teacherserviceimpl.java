package org.simplilearn.lms.Service;

import org.simplilearn.lms.dao.TeacherDao;
import org.simplilearn.lms.dao.TeacherDaoimpl;
import org.simplilearn.lms.entity.Teacher;

public class Teacherserviceimpl implements Teacherservive {
 TeacherDao Dao=new TeacherDaoimpl();
	@Override
	public void addTeacher(Teacher teacher) {
		Dao.insert(teacher);
		
	}
	@Override
	public Teacher getTeacher(String Name) {
		// TODO Auto-generated method stub
		return Dao.get(Name);
	}
	@Override
	public void deleteTeacher(Teacher teacher) {
		Dao.delete(teacher);
		
	}
	@Override
	public void updateTeacher(Teacher teacher) {
		Dao.update(teacher);
		
	}

}
