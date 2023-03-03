package orgg.simplilearn.lms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orgg.simplilearn.lms.Dao.AirlinesDao;
import orgg.simplilearn.lms.Dao.AirlinesDaoimpl;
import orgg.simplilearn.lms.entity.Airlines;
import orgg.simplilearn.lms.entity.Flights;
@WebServlet("/displayair")
public class Displayairlinecontroller  extends HttpServlet{
	AirlinesDao Dao=new AirlinesDaoimpl();
	@Override
	protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
	{
	     
		
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        List<Airlines> airlines=Dao.getAll();
        
        System.out.println(airlines);
        
        req.setAttribute("airlines", airlines);
        RequestDispatcher rd=req.getRequestDispatcher ("DisplayAirlines.jsp");
	     rd.forward(req,resp);
}
	}
	

