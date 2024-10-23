package com.xworkz.servlet.forms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		if (service.validateAndSave(dto)) {
			System.out.println("booking is success");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/concert.jsp");
			String place = req.getParameter("location");
			req.setAttribute("location", place);
			dispatcher.forward(req, res);

		} else {
			System.out.println("not success");
		}


	}
}
