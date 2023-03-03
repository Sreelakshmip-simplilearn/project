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
import orgg.simplilearn.lms.Dao.PlacesDao;
import orgg.simplilearn.lms.Dao.PlacesDaoimpl;
import orgg.simplilearn.lms.entity.Airlines;
import orgg.simplilearn.lms.entity.Places;

@WebServlet("/updateplaces")
public class updateplacescontroller extends HttpServlet{
	 PlacesDao Dao=new PlacesDaoimpl();
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
		Places places=new Places();
		int tripid=Integer.parseInt(req.getParameter("tripid"));
		String destination=req.getParameter("destination");
		String source=req.getParameter("source");
		String endtime=req.getParameter("endtime");
		String starttime=req.getParameter("starttime");
		
		
	places.setDestination(destination);
	places.setEndtime(endtime);
	places.setSource(source);
	places.setStarttime(starttime);
	places.setTripid(tripid);
		
	
		Dao.update(places);
		req.setAttribute("msg", "Places updated successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/Adminentries.jsp");
		rd.forward(req,resp);
            }
	

}
