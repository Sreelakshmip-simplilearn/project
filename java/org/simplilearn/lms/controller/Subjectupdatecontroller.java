package org.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.Service.Subjectservice;
import org.simplilearn.lms.Service.Subjectserviceimpl;
import org.simplilearn.lms.entity.AcademicClass;
import org.simplilearn.lms.entity.Subject;

@WebServlet("/updatesubject")
public class Subjectupdatecontroller extends HttpServlet{
	Subjectservice serv=new Subjectserviceimpl();
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
		Subject subject=new Subject();
		int sid=Integer.parseInt(req.getParameter("sid"));
		String name=req.getParameter("name");
		
		subject.setSid(sid);
		subject.setName(name);
		
		serv.updatesubject(subject);;
		req.setAttribute("msg", "Subject updated successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/home.jsp");
		rd.forward(req,resp);
            }
	
	}


