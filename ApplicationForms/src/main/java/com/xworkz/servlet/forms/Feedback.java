package com.xworkz.servlet.forms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.FeedbackDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/submit")
public class Feedback extends HttpServlet {

	public Feedback() {
		System.out.println("Created Feedback Form");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in Feedback");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String comments = req.getParameter("comments");

		FeedbackDTO dto = new FeedbackDTO(name, email, comments);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Comments: " + comments);

		PrintWriter print = res.getWriter();
		print.print("<html><body>");
		print.print("<h2>Success in sending Data</h2>");

	}
}
