package com.xworkz.servlet.forms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.MovieTicketDTO;
import com.xworkz.servlet.service.MovieTicketService;
import com.xworkz.servlet.service.MovieTicketServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/book")
public class MovieTicket extends HttpServlet {

	public MovieTicket() {
		System.out.println("Created MovieTicket Form");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in MovieTicket");

		String name = req.getParameter("name");
		String totalTickets = req.getParameter("totalTickets");
		String theaterName = req.getParameter("theaterName");
		String seatType = req.getParameter("seatType");
		String donation = req.getParameter("donation");
		String date = req.getParameter("date");
		String time = req.getParameter("time");
		
		int totalTicketsConverted=Integer.valueOf(totalTickets);
		double donationConverted = Double.valueOf(donation);
		

		MovieTicketDTO dto = new MovieTicketDTO(name, totalTicketsConverted, theaterName, seatType, donationConverted, date, time);
		
		MovieTicketService service=new MovieTicketServiceImpl();
		
		if (service.validateAndSave(dto)) {
			System.out.println("movieTicket is success");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/movieTicket.jsp");
			String movieName = req.getParameter("name");
			req.setAttribute("name", movieName);
			dispatcher.forward(req, res);

		} else {
			System.out.println("not success");
		}

	}
}
