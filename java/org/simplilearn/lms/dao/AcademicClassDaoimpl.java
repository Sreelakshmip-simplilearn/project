package org.simplilearn.lms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.simplilearn.lms.config.configurationfile;
import org.simplilearn.lms.entity.AcademicClass;


public class AcademicClassDaoimpl implements AcademicClassDao {
	@Override
	public void insert(AcademicClass academicclass) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(academicclass);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<AcademicClass> getAll() {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Query<AcademicClass> query=session.createQuery("Select c from org.simplilearn.lms.entity.AcademicClass c");
		return query.list();
	}

	@Override
	public void delete(AcademicClass academicclass) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(academicclass);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void update(AcademicClass academicclass) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.update(academicclass);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public AcademicClass get(int cid) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		AcademicClass academicclass=session.get(AcademicClass.class,cid);
		return academicclass;
	}
	

}
