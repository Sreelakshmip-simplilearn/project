package orgg.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orgg.simplilearn.lms.entity.Admin;
import orgg.simplilearn.lms.service.AdminSerniceimpl;
import orgg.simplilearn.lms.service.AdminService;
@WebServlet("/Adminregister")
public class Admincontroller extends HttpServlet  {
	
	  private AdminService Userservice=new AdminSerniceimpl();
		@Override
		protected void doPost(HttpServletRequest req,
	            HttpServletResponse resp)
	     throws ServletException,
	            IOException
		{
		resp.setContentType("text/html");
		String Name=req.getParameter("Name");
		String Password=req.getParameter("Password");
		Admin admin=new Admin();
		admin.setName(Name);
		admin.setPassword(Password);
		Userservice.insert(admin);
		req.setAttribute("msg", "admin registered Successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/Adminlogin.jsp");
		rd.forward(req,resp);
		
		}
		}


