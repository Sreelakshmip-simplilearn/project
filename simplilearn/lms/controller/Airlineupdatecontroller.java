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


@WebServlet("/updateairlines")
public class Airlineupdatecontroller extends HttpServlet{
	AirlinesDao serv=new AirlinesDaoimpl();
	protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException
            {
		Airlines airlines=new Airlines();
		int airlineid=Integer.parseInt(req.getParameter("airlineid"));
		String Airlinename=req.getParameter("Airlinename");
		
		airlines.setairlineid(airlineid);
		airlines.setAirlinename(Airlinename);
		
		serv.update(airlines);
		req.setAttribute("msg", "Airlines updated successfully");
		RequestDispatcher rd=req.getRequestDispatcher ("/Adminentries.jsp");
		rd.forward(req,resp);
            }
	
}
