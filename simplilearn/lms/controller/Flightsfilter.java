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

import orgg.simplilearn.lms.Dao.FlightsDao;
import orgg.simplilearn.lms.Dao.FlightsDaoimpl;
import orgg.simplilearn.lms.entity.Flights;
@WebServlet("/flightdetails")
public class Flightsfilter extends HttpServlet{
	FlightsDao Dao=new FlightsDaoimpl();
	@Override
	protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
	{
	     
		String source=req.getParameter("source");
		String destination=req.getParameter("destination");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        List<Flights> flights=(List<Flights>)req.getAttribute("flights");
        
        System.out.println(flights);
        for(Flights flig:flights)
        {
        if(flig.getDestination()==destination)
        {
        req.setAttribute("flights", flights);
        RequestDispatcher rd=req.getRequestDispatcher ("flightdetails.jsp");
	     rd.forward(req,resp);
}
	}
	
	}
}
