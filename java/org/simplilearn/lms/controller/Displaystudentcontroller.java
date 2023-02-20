package org.simplilearn.lms.controller;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.Service.Subjectservice;
import org.simplilearn.lms.Service.Subjectserviceimpl;
import org.simplilearn.lms.dao.AcademicClassDao;
import org.simplilearn.lms.dao.AcademicClassDaoimpl;
import org.simplilearn.lms.dao.StudentDao;
import org.simplilearn.lms.dao.StudentDaoimpl;
import org.simplilearn.lms.dao.SubjectDao;
import org.simplilearn.lms.dao.SubjectDaoimpl;
import org.simplilearn.lms.entity.AcademicClass;
import org.simplilearn.lms.entity.Student;
import org.simplilearn.lms.entity.Subject;
import org.simplilearn.lms.entity.Teacher;
@WebServlet("/displaystudents")
public class Displaystudentcontroller extends HttpServlet{
	private StudentDao Dao = new StudentDaoimpl();
	@Override	
		protected void doGet(HttpServletRequest req,
	            HttpServletResponse resp)
	     throws ServletException,
	            IOException
	            {
		          
		
		           List<Student> students=Dao.getAll();
		           req.setAttribute("students", students);
		           RequestDispatcher rd=req.getRequestDispatcher ("displaysubjects.jsp");
		  	     rd.forward(req,resp);
		           
			
			
	            }

	            }
