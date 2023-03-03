package orgg.simplilearn.lms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import orgg.simplilearn.lms.Dao.FlightsDao;
import orgg.simplilearn.lms.Dao.FlightsDaoimpl;
import orgg.simplilearn.lms.entity.Flights;
import orgg.simplilearn.lms.service.FlightService;
import orgg.simplilearn.lms.service.FlightServiceimpl;
@WebServlet("/Addflights")
public class Flightscontroller extends HttpServlet{
	 private FlightService flightservice=new FlightServiceimpl();
	 FlightsDao Dao=new FlightsDaoimpl();
	@Override
		protected void doPost(HttpServletRequest req,
	            HttpServletResponse resp)
	     throws ServletException,
	            IOException
		{
		resp.setContentType("text/html");
		String flightname=req.getParameter("flightname");
		String source=req.getParameter("source");
		String destination=req.getParameter("destination");
		String Date=req.getParameter("Date");
		String Price=req.getParameter("Price");
		Flights flight=new Flights();
		flight.setFlightname(flightname);
		flight.setSource(source);
		flight.setDestination(destination);
		flight.setDate(Date);
		flight.setPrice(Price);
		flightservice.insert(flight);
		List<Flights> flights=Dao.get(source, destination);
		req.setAttribute("flights", flights);
		req.setAttribute("msg", "Flight details entered successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/Adminentries.jsp");
		rd.forward(req,resp);
		
}
}
