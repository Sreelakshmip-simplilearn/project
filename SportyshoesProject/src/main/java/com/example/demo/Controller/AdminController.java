package com.example.demo.Controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Admin;
import com.example.demo.Repository.SportyshoesAdminrepo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Controller
public class AdminController {

	Logger log=Logger.getAnonymousLogger();
	@Autowired
	SportyshoesAdminrepo repo;
	
	@RequestMapping("/")
	public ModelAndView loadfrontpage(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		log.info("loaded index page");
		return mv;
	}
	@RequestMapping("/Login")
	public ModelAndView loginaction(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		log.info("inside the login page");
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");
    if((repo.findbyUserName(UserName)!=null)&&((repo.findbyPassword(Password)!=null)))
	{
		if(repo.findbyUserName(UserName).equals(repo.findbyPassword(Password)))
		{
			log.info("login successfull");
			mv.setViewName("display.jsp");
			mv.addObject("UserName",UserName);
			log.info("control passed to display.jsp");
			
		}
		else
		{
			mv.setViewName("fail.jsp");
			log.info("login failed");
			
		}
	}
    
    else
	{
		mv.setViewName("fail.jsp");
		log.info("login failed");
		
	}
		return mv;
	}
	@RequestMapping("/Register")
	public ModelAndView Registeraction(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		log.info("inside the login page");
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");
		Admin adm=new Admin();
		adm.setUserName(UserName);
		adm.setPassword(Password);
		return mv;
         
	}
}
