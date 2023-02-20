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
import org.simplilearn.lms.Service.Teacherserviceimpl;
import org.simplilearn.lms.Service.Teacherservive;
import org.simplilearn.lms.entity.Subject;
import org.simplilearn.lms.entity.Teacher;

@WebServlet("/updateteacher")
public class Teacherupdatecontroller extends HttpServlet {
	Teacherservive serv=new Teacherserviceimpl();
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
		Teacher teacher=new Teacher();
		int tid=Integer.parseInt(req.getParameter("tid"));
		String address=req.getParameter("address");
		String designation=req.getParameter("designation");
		String name=req.getParameter("name");
		String skill=req.getParameter("skill");
		
		teacher.setTid(tid);
		teacher.setAddress(address);
		teacher.setDesignation(designation);
		teacher.setName(name);
		teacher.setSkill(skill);
		
		
		serv.updateTeacher(teacher);;
		req.setAttribute("msg", "Teacher updated successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/home.jsp");
		rd.forward(req,resp);
            }
	
	}



