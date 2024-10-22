package com.xworkz.servlet.forms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.ConcertTiketDTO;
import com.xworkz.servlet.service.ConcertTicketService;
import com.xworkz.servlet.service.ConcertTicketServiceImpl;
import com.xworkz.servlet.service.CricketService;
import com.xworkz.servlet.service.CricketserviceImpl;


@WebServlet(loadOnStartup = 1, urlPatterns = "/bookTicket")
public class ConcertTicket extends HttpServlet {

	public ConcertTicket() {
		System.out.println("Created ConcertTicket Form");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in ConcertTicket");

		String location = req.getParameter("location");
		String artistName = req.getParameter("artistName");
		String ticketType=req.getParameter("ticketType");
		String totalTickets = req.getParameter("totalTickets");
		String prefernceType = req.getParameter("prefernceType");

		int totalTicketsConverted = Integer.valueOf(totalTickets);

		ConcertTiketDTO dto=new ConcertTiketDTO(location, artistName, ticketType, totalTicketsConverted, prefernceType);
		System.out.println(dto);
		

		ConcertTicketService service=new ConcertTicketServiceImpl();
		boolean validate=service.validateAndSave(dto);
		if(validate) {
			System.out.println("Valid data");
		}
		else {
			System.err.println("Invalid Data");
		}

		PrintWriter print = res.getWriter();
		print.print("<html><body>");
		print.print("<h2>Success in sending Data</h2>");

	}
}
