package orgg.simplilearn.lms.controller;

import java.io.IOException;


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
@WebServlet("/update")
public class Flightsupdatecontroller extends HttpServlet {
	
private FlightsDao fd=new FlightsDaoimpl();
@Override
protected void doPost(HttpServletRequest req,
        HttpServletResponse resp)
 throws ServletException,
        IOException
        {
	int flightid=Integer.parseInt(req.getParameter("flightid"));
	String flightname=req.getParameter("flightname");
	String source=req.getParameter("source");
	String destination=req.getParameter("destination");
	
	Flights flights=new Flights();
	flights.setFlightid(flightid);
	flights.setFlightname(flightname);
	flights.setSource(source);
	flights.setDestination(destination);
	fd.update(flights);
	req.setAttribute("msg", "Flight details Updated successfully");
	RequestDispatcher rd=req.getRequestDispatcher ("/Adminentries.jsp");
	
        }
}
