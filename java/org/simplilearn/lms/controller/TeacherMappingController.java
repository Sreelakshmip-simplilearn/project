package org.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.simplilearn.lms.Service.Teacherserviceimpl;
import org.simplilearn.lms.Service.Teacherservive;
import org.simplilearn.lms.Service.Subjectservice;
import org.simplilearn.lms.Service.Subjectserviceimpl;
import org.simplilearn.lms.dao.SubjectDao;
import org.simplilearn.lms.dao.SubjectDaoimpl;
import org.simplilearn.lms.entity.Subject;
import org.simplilearn.lms.entity.Teacher;


public class TeacherMappingController extends HttpServlet {
	private Teacherservive teacherservice=new Teacherserviceimpl();
	private SubjectDao Subjectservice=new SubjectDaoimpl();
	@Override	
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
            String name=req.getParameter("name");
            HttpSession session=req.getSession();
            int sid=(int) session.getAttribute("sid");
            Teacher teacher=teacherservice.getTeacher("name");
            Subject subject=Subjectservice.get(sid);
            teacher.addsubjects(subject);
            subject.setTeacher(teacher);
            teacherservice.addTeacher(teacher);
            
            }

}
