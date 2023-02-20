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
import org.simplilearn.lms.entity.Subject;

@WebServlet("/addsub")
public class SubjectController extends HttpServlet {
	private Subjectservice subsr=new Subjectserviceimpl();
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
		String Subject=req.getParameter("Subject");
		Subject subject2=new Subject();
		subject2.setName(Subject);
		subsr.addsubject(subject2);
		req.setAttribute("msg", "Subject added successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/home.jsp");
		rd.forward(req,resp);
            
            }

}
