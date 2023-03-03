package orgg.simplilearn.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orgg.simplilearn.lms.entity.Flights;
import orgg.simplilearn.lms.entity.Places;
import orgg.simplilearn.lms.service.PlacesService;
import orgg.simplilearn.lms.service.PlacesServiceimpl;

@WebServlet("/Deleteplaces")
public class Deleteplacescontroller extends HttpServlet{
	PlacesService Dao=new PlacesServiceimpl();
	@Override
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
	{
	
	Places places=new Places();
	int tripid=Integer.parseInt(req.getParameter("tripid"));
	places.setTripid(tripid);
	Dao.delete(places);
	req.setAttribute("msg", "Places details Deleted successfully");
	RequestDispatcher rd=req.getRequestDispatcher ("/Adminentries.jsp");
	rd.forward(req,resp);
	
}
}
