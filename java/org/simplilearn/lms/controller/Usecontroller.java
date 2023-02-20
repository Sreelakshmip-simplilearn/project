package org.simplilearn.lms.controller;
import javax.servlet.http.*;

import org.simplilearn.lms.Service.Userservice;
import org.simplilearn.lms.Service.Userserviceimpl;
import org.simplilearn.lms.entity.User;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/register")
public class Usecontroller extends HttpServlet 
{
  private Userservice Userservice=new Userserviceimpl();
	@Override
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
	{
	resp.setContentType("text/html");
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	String usertype=req.getParameter("usertype");
	User user=new User();
	user.setUsername(username);
	user.setPassword(password);
	user.setUsertype(usertype);
	Userservice.insert(user);
	req.setAttribute("msg", "Admin registered Successfully");
	RequestDispatcher rd=req.getRequestDispatcher ("/index.jsp");
	rd.forward(req,resp);
	
	}
	}
