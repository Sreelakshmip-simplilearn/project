package orgg.simplilearn.lms.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import orgg.simplilearn.lms.config.Configurationfile;
import orgg.simplilearn.lms.entity.Airlines;
import orgg.simplilearn.lms.entity.Flights;

public class AirlinesDaoimpl implements AirlinesDao {

	@Override
	public void insert(Airlines airlines) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(airlines);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void delete(Airlines airlines) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.remove(airlines);
			
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}
		
	

	@Override
	public void update(Airlines airlines) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.update(airlines);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public List<Airlines> getAll() {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		//Query<Student> query=session.createQuery("from Student");
		//List<Student> students=session.createQuery("from Student",Student.class).list();
		Query<Airlines> airlines=session.createQuery("select st from orgg.simplilearn.lms.entity.Airlines st");
		System.out.println(airlines);
		return airlines.list();
	}
	

}
