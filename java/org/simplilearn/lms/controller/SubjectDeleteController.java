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
import org.simplilearn.lms.dao.SubjectDao;
import org.simplilearn.lms.dao.SubjectDaoimpl;
import org.simplilearn.lms.entity.Subject;
@WebServlet("/deletesubject")
public class SubjectDeleteController extends HttpServlet{

	private Subjectservice subsr=new Subjectserviceimpl();
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
		int sid=Integer.parseInt(req.getParameter("sid"));
		
		Subject subject2=new Subject();
		subject2.setSid(sid);
		
		
		subsr.deletesubject(subject2);
		req.setAttribute("msg", "Subject deleted successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/index.jsp");
		rd.forward(req,resp);
            
            }


}
