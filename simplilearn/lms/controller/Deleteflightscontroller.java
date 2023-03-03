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
import orgg.simplilearn.lms.Dao.FlightsDao;
import orgg.simplilearn.lms.Dao.FlightsDaoimpl;
import orgg.simplilearn.lms.entity.Airlines;
import orgg.simplilearn.lms.entity.Flights;
import orgg.simplilearn.lms.service.FlightService;
import orgg.simplilearn.lms.service.FlightServiceimpl;

@WebServlet("/Deleteflights")
public class Deleteflightscontroller extends HttpServlet {
	private FlightService Dao=new FlightServiceimpl();
	@Override
		protected void doPost(HttpServletRequest req,
	            HttpServletResponse resp)
	     throws ServletException,
	            IOException
		{
		
		Flights flights=new Flights();
		int flightid=Integer.parseInt(req.getParameter("flightid"));
		flights.setFlightid(flightid);
		Dao.delete(flights);
		req.setAttribute("msg", "Flights details Deleted successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/Adminentries.jsp");
		rd.forward(req,resp);
		
}
}

