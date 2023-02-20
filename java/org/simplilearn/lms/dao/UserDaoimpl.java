package org.simplilearn.lms.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.simplilearn.lms.config.configurationfile;

import org.simplilearn.lms.entity.User;

public class UserDaoimpl implements UserDao {
	@Override
	public void insert(User user) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
		
	}

	@Override
	public User get(String username, String password) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Query<User> query= session.createQuery("Select u from org.simplilearn.lms.entity.User u where u.username=?1 and u.password=?2");
		query.setParameter(1, username);
		query.setParameter(2, password);
		return query.getSingleResult();
	}

	@Override
	public void update(User user) {
		SessionFactory factory=configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
	}

}
