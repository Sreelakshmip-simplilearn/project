package org.simplilearn.lms.Service;

import org.simplilearn.lms.dao.AcademicClassDao;
import org.simplilearn.lms.dao.AcademicClassDaoimpl;
import org.simplilearn.lms.entity.AcademicClass;

public class Academicserviceimpl implements Academicservice {
AcademicClassDao Dao=new AcademicClassDaoimpl();
	@Override
	public void deleteAcademicClass(AcademicClass academicClass) {
		
		Dao.delete(academicClass);
	}
	@Override
	public void updateAcademicClass(AcademicClass academicClass) {
		Dao.update(academicClass);
		
	}
	

}
