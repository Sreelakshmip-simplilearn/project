package org.simplilearn.lms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.simplilearn.lms.config.configurationfile;
import org.simplilearn.lms.entity.Teacher;

public class TeacherDaoimpl implements TeacherDao {

	@Override
	public void insert(Teacher teacher) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(teacher);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Teacher> getAll() {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Query<Teacher> query=session.createQuery("Select t from org.simplilearn.lms.entity.Teacher t");
		return query.list();
	}

	@Override
	public void delete(Teacher teacher) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(teacher);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void update(Teacher teacher) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.update(teacher);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public Teacher get(int tid) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Teacher teacher=session.get(Teacher.class,tid);
		return teacher;
	}

	@Override
	public Teacher get(String Name) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Query<Teacher> query=session.createQuery("Select t from org.simplilearn.lms.entity.Teacher t where name=?1");
		query.setParameter(1,Name);
		return query.getSingleResult();
		
	}
		
	}


