package orgg.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orgg.simplilearn.lms.entity.Places;
import orgg.simplilearn.lms.service.PlacesService;
import orgg.simplilearn.lms.service.PlacesServiceimpl;

@WebServlet("/Addplaces")
public class Placescontroller extends HttpServlet {
	 private PlacesService placesservice=new PlacesServiceimpl();
		@Override
			protected void doPost(HttpServletRequest req,
		            HttpServletResponse resp)
		     throws ServletException,
		            IOException
			{
			resp.setContentType("text/html");
			String starttime=req.getParameter("starttime");
			String endtime=req.getParameter("endtime");
			String source=req.getParameter("source");
			String destination=req.getParameter("destination");
			Places places=new Places();
			places.setStarttime(starttime);
			places.setEndtime(endtime);
			places.setSource(source);
			places.setDestination(destination);
			placesservice.insert(places);
			req.setAttribute("msg", "Places details entered successfully");
			RequestDispatcher rd=req.getRequestDispatcher ("/Adminentries.jsp");
			rd.forward(req,resp);
			
	}
	
}
