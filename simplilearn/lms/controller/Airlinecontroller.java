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
import orgg.simplilearn.lms.entity.Flights;
import orgg.simplilearn.lms.service.FlightService;
import orgg.simplilearn.lms.service.FlightServiceimpl;

@WebServlet("/AddAirlines")
public class Airlinecontroller extends HttpServlet{
	 private AirlinesDao Dao=new AirlinesDaoimpl();
		@Override
			protected void doPost(HttpServletRequest req,
		            HttpServletResponse resp)
		     throws ServletException,
		            IOException
			{
			resp.setContentType("text/html");
			String airlinename=req.getParameter("airlinename");
			Airlines airline=new Airlines();
			airline.setAirlinename(airlinename);
			Dao.insert(airline);
			req.setAttribute("msg", "Flight details entered successfully");
			RequestDispatcher rd=req.getRequestDispatcher ("/Adminentries.jsp");
			rd.forward(req,resp);
			
	}
	}


