package com.xworkz.servlet.ticket;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.TicketDTO;
import com.xworkz.servlet.service.TicketService;
import com.xworkz.servlet.service.TicketServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/book")
public class TicketServlet extends HttpServlet{

	public TicketServlet() {
		System.out.println("no arg constructor in TicketServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String stadiumName=req.getParameter("stadiumName");
		String tickets=req.getParameter("tickets");
		String primaryContact=req.getParameter("primaryContact");
		String email=req.getParameter("email");

		
		int ticketsConverted=Integer.valueOf(tickets);
		long primaryContactConverted=Long.valueOf(primaryContact);
		
		TicketService service=new TicketServiceImpl();
		TicketDTO dto=new TicketDTO(stadiumName, ticketsConverted, primaryContactConverted, email);
		boolean valid=service.validAndSave(dto);
		
		if(valid) {
			System.out.println("Valid data");
			req.setAttribute("success", "Ticket Booking is Successful");
		}
		else {
			System.out.println("invalid data");
			req.setAttribute("failure", "Ticket Booking is failure");
			req.setAttribute("dto", new TicketDTO(stadiumName,ticketsConverted, primaryContactConverted, email));
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Booking.jsp");
		requestDispatcher.forward(req, resp);
	}
	
}
