package com.xworkz.servlet.form;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.RegistrationDTO;
import com.xworkz.servlet.service.RegistrationService;
import com.xworkz.servlet.service.RegistrationServiceImpl;
@WebServlet(loadOnStartup = 1,urlPatterns = "/register")
public class RegistrationServlet  extends HttpServlet{
	
	public RegistrationServlet() {
		System.out.println("no arg constructor of RegistrationServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in RegistrationServlet");
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String age=req.getParameter("age");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String country=req.getParameter("country");
		
		int ageConverted=Integer.valueOf(age);
	
		RegistrationService service=new RegistrationServiceImpl();
		RegistrationDTO value=new RegistrationDTO(name, email, ageConverted, city, state, country);
		boolean valid=service.validAndSave(value);
		
		
		if(valid) {
			System.out.println("valid data");
			req.setAttribute("success", "Registeration is Success");
		}
		else {
			System.out.println("invalid data");
			req.setAttribute("failure", "Register is failure");
			req.setAttribute("dto", new RegistrationDTO(name,email,ageConverted,city,state,country));
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/registration.jsp");
		requestDispatcher.forward(req, res);
	}
}
