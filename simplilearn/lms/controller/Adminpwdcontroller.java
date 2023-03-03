package orgg.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orgg.simplilearn.lms.Dao.AdminDao;
import orgg.simplilearn.lms.Dao.AdminDaoimpl;
import orgg.simplilearn.lms.entity.Admin;

@WebServlet("/Adminpassword")
public class Adminpwdcontroller extends HttpServlet{
	AdminDao Dao=new AdminDaoimpl();
	@Override
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
	{
	resp.setContentType("text/html");
	int id=Integer.parseInt(req.getParameter("id"));
	String Name=req.getParameter("Name");
	String Password=req.getParameter("Password");
	Admin admin=new Admin();
	admin.setName(Name);
	admin.setPassword(Password);
	admin.setId(id);
	Dao.update(admin);
	req.setAttribute("msg", "admin registered Successfully");
	RequestDispatcher rd=req.getRequestDispatcher ("/Adminentries.jsp");
	rd.forward(req,resp);
	
	}

}
