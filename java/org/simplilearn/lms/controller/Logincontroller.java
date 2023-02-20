package org.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.simplilearn.lms.Service.Userservice;
import org.simplilearn.lms.Service.Userserviceimpl;
import org.simplilearn.lms.entity.User;
@WebServlet("/login")
public class Logincontroller extends HttpServlet{
	private Userservice userservice=new Userserviceimpl();
	@Override
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
	{
    String username=req.getParameter("username");
    String password=req.getParameter("password");
    User user=userservice.get(username,password);
    if(user!=null && (user.getUsertype().equals("admin")))
    {
    	HttpSession session=req.getSession();
    	session.setAttribute("user",user);
    	RequestDispatcher rd=req.getRequestDispatcher("/home.jsp");
    	rd.forward(req, resp);
    }
    else
    {
    req.setAttribute("msg", "username or password is invalid");
    RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
    rd.forward(req, resp);
    }
    
   
    
}
}
