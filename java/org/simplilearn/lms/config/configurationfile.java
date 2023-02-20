package org.simplilearn.lms.config;


import java.util.*;



import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.simplilearn.lms.entity.AcademicClass;
import org.simplilearn.lms.entity.Student;
import org.simplilearn.lms.entity.Subject;
import org.simplilearn.lms.entity.Teacher;
import org.simplilearn.lms.entity.User;




public class configurationfile {
	public static SessionFactory getSessionFactory () throws HibernateException
	{
	org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
	Properties properties=new Properties();
	properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
	properties.put(Environment.URL, "jdbc:mysql://localhost:3306/project1");
	properties.put(Environment.USER, "root");
	properties.put(Environment.PASS, "Rema@143");
	properties.put(Environment.SHOW_SQL, true);
	properties.put(Environment.FORMAT_SQL,true);
	properties.put(Environment.HBM2DDL_AUTO,"update");
	properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
	configuration.setProperties(properties);
	configuration.addAnnotatedClass(Teacher.class);
	configuration.addAnnotatedClass(Student.class);
	configuration.addAnnotatedClass(Subject.class);
	configuration.addAnnotatedClass(AcademicClass.class);
	configuration.addAnnotatedClass(User.class);
	SessionFactory sessionfactory=configuration.buildSessionFactory();
	return sessionfactory;
	
	
	
	
	
	
	
	
	}
	

}
