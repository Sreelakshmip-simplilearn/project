package org.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.dao.StudentDao;
import org.simplilearn.lms.dao.StudentDaoimpl;
import org.simplilearn.lms.entity.Student;

@WebServlet("/addstudent")
public class StudentController extends HttpServlet {
	StudentDao Dao=new StudentDaoimpl();
	@Override
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
	            
		Student student=new Student();
		String Name=req.getParameter("Name");
		String address=req.getParameter("address");
		int age=Integer.parseInt(req.getParameter("age"));
		student.setName(Name);
		student.setAddress(address);
		student.setAge(age);
		Dao.insert(student);
		req.setAttribute("msg", "Student added successfully");
		 RequestDispatcher rd=req.getRequestDispatcher ("/home.jsp");
	     rd.forward(req,resp);
		
	            }
	

}
