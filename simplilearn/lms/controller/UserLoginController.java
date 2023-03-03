package orgg.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import orgg.simplilearn.lms.entity.Admin;
import orgg.simplilearn.lms.entity.User;
import orgg.simplilearn.lms.service.AdminSerniceimpl;
import orgg.simplilearn.lms.service.AdminService;
import orgg.simplilearn.lms.service.UserService;
import orgg.simplilearn.lms.service.UserServiceimpl;

@WebServlet("/UserLogin")
public class UserLoginController extends HttpServlet{
private UserService service=new UserServiceimpl();
	
	@Override
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
	{
    String Name=req.getParameter("Name");
    String Password=req.getParameter("Password");
    User user=service.get(Name,Password);
    if(user!=null )
    {
    	HttpSession session=req.getSession();
    	session.setAttribute("Name",Name);
    	session.setAttribute("Password",Password);
    	RequestDispatcher rd=req.getRequestDispatcher("/userenteries.jsp");
    	rd.forward(req, resp);
    }
    else
    {
    req.setAttribute("msg", "username or password is invalid");
    RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
    rd.forward(req, resp);
    }
    
   
    
}
}
