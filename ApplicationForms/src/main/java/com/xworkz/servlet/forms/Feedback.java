package com.xworkz.servlet.forms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.FeedbackDTO;
import com.xworkz.servlet.service.FeedbackService;
import com.xworkz.servlet.service.FeedbackServiceImpl;

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
		System.out.println(dto);
		
		FeedbackService feedback=new FeedbackServiceImpl();
		if (feedback.validateAndSave(dto)) {
			System.out.println("giving feedback is success");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/feedback.jsp");
			String response = req.getParameter("name");
			req.setAttribute("name", response);
			dispatcher.forward(req, res);

		} else {
			System.out.println("not success");
		}

	}
}
