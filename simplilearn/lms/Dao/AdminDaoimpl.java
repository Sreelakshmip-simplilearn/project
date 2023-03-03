package orgg.simplilearn.lms.Dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import orgg.simplilearn.lms.config.Configurationfile;
import orgg.simplilearn.lms.entity.Admin;

public class AdminDaoimpl implements AdminDao {

	@Override
	public void insert(Admin admin) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(admin);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
	}

	@Override
	public Admin get(String Name, String Password) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Query<Admin> query= session.createQuery("Select A from orgg.simplilearn.lms.entity.Admin A where A.Name=?1 and A.Password=?2");
		query.setParameter(1, Name);
		query.setParameter(2, Password);
		return query.getSingleResult();
	}

	@Override
	public void update(Admin admin) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.update(admin);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
	
		
	}

}
