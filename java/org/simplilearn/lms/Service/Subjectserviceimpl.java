package org.simplilearn.lms.Service;

import java.util.List;
import java.util.Set;

import org.simplilearn.lms.dao.SubjectDao;
import org.simplilearn.lms.dao.SubjectDaoimpl;
import org.simplilearn.lms.entity.Subject;

public class Subjectserviceimpl implements Subjectservice {

	private SubjectDao dao=new SubjectDaoimpl();
	@Override
	public void addsubject(Subject subject) {
		dao.insert(subject);
		
		
	}
	@Override
	public List<Subject> getsubjects() {
		
		return dao.getAll();
	}
	@Override
	public void deletesubject(Subject subject) {
		dao.delete(subject);
		
	}
	@Override
	public void updatesubject(Subject subject) {
		
		dao.update(subject);
	}
	

}
