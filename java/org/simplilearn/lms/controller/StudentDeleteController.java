package org.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.Service.Studentservice;
import org.simplilearn.lms.Service.Studentserviceimpl;
import org.simplilearn.lms.entity.Student;
import org.simplilearn.lms.entity.Teacher;
@WebServlet("/deletestudent")
public class StudentDeleteController extends HttpServlet{
	private Studentservice subsr=new Studentserviceimpl();
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
		int stid=Integer.parseInt(req.getParameter("stid"));
		
		Student student=new Student();
		student.setStid(stid);
		
		
		subsr.deletestudent(student);
		RequestDispatcher rd=req.getRequestDispatcher ("/home.jsp");
		rd.forward(req,resp);
            
            }
}
