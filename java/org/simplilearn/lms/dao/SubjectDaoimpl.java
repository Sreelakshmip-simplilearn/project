package org.simplilearn.lms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.simplilearn.lms.config.configurationfile;
import org.simplilearn.lms.entity.Student;
import org.simplilearn.lms.entity.Subject;


public class SubjectDaoimpl implements SubjectDao {
	@Override
	public void insert(Subject subject) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(subject);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
		
	}

	
	@Override
	public List<Subject> getAll() {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		//Query<Subject> query=session.createQuery("Select s from org.simplilearn.lms.entity.Subject s");
		//return query.list();
		List<Subject> subjects=session.createQuery("from Subject",Subject.class).list();
		subjects.forEach(s->{
		return ;
		});
		return subjects;
	}

	@Override
	public void delete(Subject subject) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.remove(subject);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void update(Subject subject) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.update(subject);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public Subject get(int sid) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Subject subject=session.get(Subject.class,sid);
		return subject;
	}
		

}
