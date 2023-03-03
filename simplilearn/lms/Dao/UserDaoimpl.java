package orgg.simplilearn.lms.Dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import orgg.simplilearn.lms.config.Configurationfile;
import orgg.simplilearn.lms.entity.Admin;
import orgg.simplilearn.lms.entity.User;

public class UserDaoimpl implements UserDao {

	@Override
	public void insert(User user) {
		SessionFactory factory=Configurationfile.getSessionFactory();
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
	public void delete(User user) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(user);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(User user) {
		SessionFactory factory=Configurationfile.getSessionFactory();
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
	public User get(String Name, String Password) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Query<User> query= session.createQuery("Select U from orgg.simplilearn.lms.entity.User U where U.name=?1 and U.Password=?2");
		query.setParameter(1, Name);
		query.setParameter(2, Password);
		return query.getSingleResult();
	}
	}


