package org.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.Service.Teacherserviceimpl;
import org.simplilearn.lms.Service.Teacherservive;
import org.simplilearn.lms.entity.Teacher;

@WebServlet("/deleteteacher")
public class TeacherDeleteController extends HttpServlet{
	private Teacherservive subsr=new Teacherserviceimpl();
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
		int tid=Integer.parseInt(req.getParameter("tid"));
		
		Teacher teacher=new Teacher();
		teacher.setTid(tid);
		
		
		subsr.deleteTeacher(teacher);
		req.setAttribute("msg", "teacher deleted successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/home.jsp");
		rd.forward(req,resp);
            
            }

}
