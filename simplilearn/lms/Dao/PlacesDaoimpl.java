package orgg.simplilearn.lms.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import orgg.simplilearn.lms.config.Configurationfile;
import orgg.simplilearn.lms.entity.Flights;
import orgg.simplilearn.lms.entity.Places;

public class PlacesDaoimpl implements PlacesDao {

	@Override
	public void insert(Places places) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(places);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(Places places) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(places);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Places places) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.update(places);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Places> getAll() {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		//Query<Student> query=session.createQuery("from Student");
		//List<Student> students=session.createQuery("from Student",Student.class).list();
		Query<Places> places=session.createQuery("select st from orgg.simplilearn.lms.entity.Places st");
		System.out.println(places);
		return places.list();
	}

}
