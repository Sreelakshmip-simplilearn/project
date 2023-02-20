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
import org.simplilearn.lms.entity.Subject;
import org.simplilearn.lms.entity.Teacher;
@WebServlet("/addteacher")
public class TeacherController extends HttpServlet{
	Teacherservive Tserv=new Teacherserviceimpl();
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
		String Name=req.getParameter("Name");
		String designation=req.getParameter("designation");
		String skill=req.getParameter("skill");
		String address=req.getParameter("address");
		Teacher teacher=new Teacher();
		teacher.setName(Name);
        teacher.setDesignation(designation);
        teacher.setSkill(skill);
        teacher.setAddress(address);
        Tserv.addTeacher(teacher);
        req.setAttribute("msg", "Teacher added successfully");
        RequestDispatcher rd=req.getRequestDispatcher ("/home.jsp");
        rd.forward(req,resp);
}
}
