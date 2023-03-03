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


import orgg.simplilearn.lms.Dao.PlacesDao;
import orgg.simplilearn.lms.Dao.PlacesDaoimpl;
import orgg.simplilearn.lms.entity.Places;

@WebServlet("/displayplaces")
public class Displayplacescontroller extends HttpServlet {
	PlacesDao Dao=new PlacesDaoimpl();
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
        List<Places> places=Dao.getAll();
        
        System.out.println(places);
        
        req.setAttribute("places", places);
        RequestDispatcher rd=req.getRequestDispatcher ("placesdetails.jsp");
	     rd.forward(req,resp);
}

}
