package orgg.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orgg.simplilearn.lms.Dao.AirlinesDao;
import orgg.simplilearn.lms.Dao.AirlinesDaoimpl;
import orgg.simplilearn.lms.entity.Airlines;
import orgg.simplilearn.lms.service.AirlineService;
import orgg.simplilearn.lms.service.AirlineServiceimpl;
@WebServlet("/DeleteAirlines")
public class Airlinedeletecontroller extends HttpServlet{
	 private AirlineService Dao=new AirlineServiceimpl();
		@Override
			protected void doPost(HttpServletRequest req,
		            HttpServletResponse resp)
		     throws ServletException,
		            IOException
			{
			
			Airlines airline=new Airlines();
			int airlineid=Integer.parseInt(req.getParameter("airlineid"));
			airline.setairlineid(airlineid);
			Dao.Delete(airline);
			req.setAttribute("msg", "Airlines details Deleted successfully");
			RequestDispatcher rd=req.getRequestDispatcher ("/Adminentries.jsp");
			rd.forward(req,resp);
			
	}
	}

