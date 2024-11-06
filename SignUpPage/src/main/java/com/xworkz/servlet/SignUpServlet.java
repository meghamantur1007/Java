package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.SignUpDTO;
import com.xworkz.servlet.service.SignUpService;
import com.xworkz.servlet.service.SignUpServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/signUp")
public class SignUpServlet extends HttpServlet {

	public SignUpServlet() {
		System.out.println("no arg constructor in SignUpServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("id");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirmPassword");

		SignUpService signUpservice = new SignUpServiceImpl();
		SignUpDTO dto = new SignUpDTO(userId, email, password, confirmPassword);
		boolean valid = signUpservice.validAndSave(dto);

		if (valid) {
			System.out.println("valid data");
		
			req.setAttribute("hi", "Hi");
			req.setAttribute("userId", userId);
			req.setAttribute("success", "SignUp is Success");
		} else {
			System.out.println("invalid data");
			req.setAttribute("dto", new SignUpDTO(userId,email));
			req.setAttribute("failure", "SignUp is failure");
			req.setAttribute("dto", new SignUpDTO(userId, email, password, confirmPassword));
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/signup.jsp");
		requestDispatcher.forward(req, resp);
	}

}
