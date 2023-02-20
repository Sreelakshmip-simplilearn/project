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

@WebServlet("/UpdateStudent")
public class Studentupdatecontroller extends HttpServlet {
	Studentservice serv=new Studentserviceimpl();
	@Override
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
		Student student=new Student();
		int stid=Integer.parseInt(req.getParameter("stid"));
		String Name=req.getParameter("Name");
		String address=req.getParameter("address");
		int age=Integer.parseInt(req.getParameter("age"));
		student.setStid(stid);
		student.setAge(age);
		student.setName(Name);
		student.setAddress(address);
		
		serv.studentClass(student);
		req.setAttribute("msg", "Student Class updated successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/home.jsp");
		rd.forward(req,resp);
		
		
            }
}
