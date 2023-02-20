package org.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.dao.AcademicClassDao;
import org.simplilearn.lms.dao.AcademicClassDaoimpl;
import org.simplilearn.lms.dao.StudentDao;
import org.simplilearn.lms.dao.StudentDaoimpl;
import org.simplilearn.lms.entity.AcademicClass;
import org.simplilearn.lms.entity.Student;

@WebServlet("/addacademicclass")
public class Academicclasscontroller extends HttpServlet{
	AcademicClassDao Dao=new AcademicClassDaoimpl();
	@Override
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
	            
		AcademicClass Acclass=new AcademicClass();
		String name=req.getParameter("name");
		int duration=Integer.parseInt(req.getParameter("duration"));
		Acclass.setName(name);
		Acclass.setDuration(duration);
		Dao.insert(Acclass);
		req.setAttribute("msg", "Class added successfully");
		 RequestDispatcher rd=req.getRequestDispatcher ("/home.jsp");
	     rd.forward(req,resp);
		
	            }
	
}
