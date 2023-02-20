package org.simplilearn.lms.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.jaxb.mapping.spi.NamedQuery;
import org.hibernate.query.Query;
import org.simplilearn.lms.config.configurationfile;
import org.simplilearn.lms.entity.Student;


public class StudentDaoimpl implements StudentDao {
	@Override
	public void insert(Student student) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(student);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Student> getAll() {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Query<Student> query=session.createQuery("from Student");
		//List<Student> students=session.createQuery("from Student",Student.class).list();
		//Query<Student> students=session.createQuery("Select st from org.simplilearn.lms.entity.Student st");
		List<Student> list=query.list();
		return list;
	}

	@Override
	public void delete(Student student) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(student);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void update(Student student) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.update(student);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public Student get(int stid) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
	    Student student=session.get(Student.class,stid);
		return student;
	}
}
