package com.xworkz.servlet.forms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.MovieTicketDTO;

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

		double donationConverted = Double.valueOf(donation);

		MovieTicketDTO dto = new MovieTicketDTO(name, totalTickets, theaterName, seatType, donationConverted, date, time);
		System.out.println("Name: " + name);
		System.out.println("Email: " + totalTickets);
		System.out.println("Mobile: " + theaterName);
		System.out.println("Address: " + seatType);
		System.out.println("Donation: " + donationConverted);
		System.out.println("Date: " + date);
		System.out.println("Time: " + time);

		PrintWriter print = res.getWriter();
		print.print("<html><body>");
		print.print("<h2>Success in sending Data</h2>");

	}
}
