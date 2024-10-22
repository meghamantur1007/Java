package com.xworkz.servlet.forms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.CricketDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/cricketTicket")
public class CricketTicket extends HttpServlet {

	public CricketTicket() {
		System.out.println("Created CricketTicket Form");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in CricketTicket");

		String groundName = req.getParameter("groundName");
		String customerName = req.getParameter("customerName");
		String customerEmail = req.getParameter("customerEmail");
		String seatType = req.getParameter("seatType");
		String noOfTickets = req.getParameter("noOfTickets");

		int noOfTicketsConverted = Integer.valueOf(noOfTickets);

		CricketDTO dto = new CricketDTO(groundName, customerName, customerEmail, seatType, noOfTicketsConverted);
		System.out.println("Ground Name: " + groundName);
		System.out.println("CustomerName: " + customerName);
		System.out.println("CustomerEmail: " + customerEmail);
		System.out.println("seatType: " + seatType);
		System.out.println("Number Of Tickets: " + noOfTicketsConverted);

		PrintWriter print = res.getWriter();
		print.print("<html><body>");
		print.print("<h2>Success in sending Data</h2>");

	}
}
