package org.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.Service.Academicservice;
import org.simplilearn.lms.Service.Academicserviceimpl;
import org.simplilearn.lms.entity.AcademicClass;

@WebServlet("/deleteacademicclass")
public class AcademicClassDeleteController extends HttpServlet {
	Academicservice serv=new Academicserviceimpl();
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
		AcademicClass Class=new AcademicClass();
		int cid=Integer.parseInt(req.getParameter("cid"));
		Class.setCid(cid);
		serv.deleteAcademicClass(Class);
		req.setAttribute("msg", "Academic Class deleted successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/home.jsp");
		rd.forward(req,resp);
            }
	

}
