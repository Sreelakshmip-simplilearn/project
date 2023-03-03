package orgg.simplilearn.lms.config;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import orgg.simplilearn.lms.entity.Admin;
import orgg.simplilearn.lms.entity.Airlines;
import orgg.simplilearn.lms.entity.User;
import orgg.simplilearn.lms.entity.Flights;
import orgg.simplilearn.lms.entity.Places;

public class Configurationfile {
	public static SessionFactory getSessionFactory () throws HibernateException
	{
	org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
	Properties properties=new Properties();
	properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
	properties.put(Environment.URL, "jdbc:mysql://localhost:3306/Project2FlyAway");
	properties.put(Environment.USER, "root");
	properties.put(Environment.PASS, "Rema@143");
	properties.put(Environment.SHOW_SQL, true);
	properties.put(Environment.FORMAT_SQL,true);
	properties.put(Environment.HBM2DDL_AUTO,"update");
	properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
	configuration.setProperties(properties);
	configuration.addAnnotatedClass(Airlines.class);
	configuration.addAnnotatedClass(Flights.class);
	configuration.addAnnotatedClass(User.class);
	configuration.addAnnotatedClass(Places.class);
	configuration.addAnnotatedClass(Admin.class);
	SessionFactory sessionfactory=configuration.buildSessionFactory();
	return sessionfactory;
	
	
	
	
	
	
	
	
	}
}
