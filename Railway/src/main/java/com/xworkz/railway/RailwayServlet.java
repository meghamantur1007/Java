package com.xworkz.railway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")
public class RailwayServlet extends HttpServlet {

	public RailwayServlet() {
		System.out.println("Created RailwayServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in RailwayServlet");

		String name = req.getParameter("name");
		String source = req.getParameter("psource");
		String destination = req.getParameter("dest");
		String start = req.getParameter("sdate");
		String returnDate = req.getParameter("rdate");
		String seat = req.getParameter("seat");
		String tickets = req.getParameter("tticket");
		String noOfMale = req.getParameter("males");
		String noOfFemale = req.getParameter("females");

		System.out.println("name:" + name);
		System.out.println("source:" + source);
		System.out.println("dest:" + destination);
		System.out.println("start:" + start);
		System.out.println("returnDate:" + returnDate);
		System.out.println("seat:" + seat);
		System.out.println("tickets:" + tickets);
		System.out.println("males:" + noOfMale);
		System.out.println("females:" + noOfFemale);

		res.setContentType("text/html");
		PrintWriter print = res.getWriter();

		res.setContentType("text/html");

		print.print("<html><body>");
		print.print("<h2>Success Displaying Informations</h2>");
		print.print("<p>Name: " + name + "</p>");
		print.print("<p>Source: " + source + "</p>");
		print.print("<p>Destination: " + destination + "</p>");
		print.print("<p>Start Date: " + start + "</p>");
		print.print("<p>Return Date: " + returnDate + "</p>");
		print.print("<p>Seat Type: " + seat + "</p>");
		print.print("<p>Total Tickets: " + tickets + "</p>");
		print.print("<p>Number of Males: " + noOfMale + "</p>");
		print.print("<p>Number of Females: " + noOfFemale + "</p>");
		print.print("</body></html>");

	}

}
