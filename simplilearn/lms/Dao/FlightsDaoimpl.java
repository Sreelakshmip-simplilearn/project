package orgg.simplilearn.lms.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import orgg.simplilearn.lms.config.Configurationfile;
import orgg.simplilearn.lms.entity.Flights;

public class FlightsDaoimpl implements FlightsDao {

	@Override
	public void insert(Flights flights) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(flights);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void delete(Flights flights) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(flights);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void update(Flights flights) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.update(flights);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public
	List<Flights> get(String source, String destination) {
		SessionFactory factory=Configurationfile.getSessionFactory();
		Session session=factory.openSession();
	    Query<Flights>flights=  session.createQuery("Select u.flightname from orgg.simplilearn.lms.entity.Flights u where u.source=?1 and u.destination=?2");
		flights.setParameter(1, source);
		flights.setParameter(2, destination);
		return flights.list();
	}

	@Override
	public List<Flights> getAll() {
			SessionFactory factory=Configurationfile.getSessionFactory();
			Session session=factory.openSession();
			//Query<Student> query=session.createQuery("from Student");
			//List<Student> students=session.createQuery("from Student",Student.class).list();
			Query<Flights> flights=session.createQuery("select st from orgg.simplilearn.lms.entity.Flights st");
			System.out.println(flights);
			return flights.list();
		}

	}


