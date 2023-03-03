package orgg.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orgg.simplilearn.lms.entity.Admin;
import orgg.simplilearn.lms.entity.User;
import orgg.simplilearn.lms.service.AdminSerniceimpl;
import orgg.simplilearn.lms.service.AdminService;
import orgg.simplilearn.lms.service.UserService;
import orgg.simplilearn.lms.service.UserServiceimpl;
@WebServlet("/UserRegister")
public class Usercontroller extends HttpServlet {
	  private UserService serv=new UserServiceimpl();
			@Override
			protected void doPost(HttpServletRequest req,
		            HttpServletResponse resp)
		     throws ServletException,
		            IOException
			{
			resp.setContentType("text/html");
			String Name=req.getParameter("Name");
			String Password=req.getParameter("Password");
			User user=new User();
			user.setName(Name);
			user.setPassword(Password);
			serv.insert(user);
			req.setAttribute("msg", "User registered Successfully");
			RequestDispatcher rd=req.getRequestDispatcher ("/UserLogin.jsp");
			rd.forward(req,resp);
			
			}
}
