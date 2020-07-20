package com.tutorial.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("i am in server program get");
		String uid = req.getParameter("userid");
		String pas = req.getParameter("passsword");

		if (uid.equals("java@g.com") && pas.equals("jee")) {
			res.sendRedirect("welcome.html");
		} else {
			res.sendRedirect("mywebsite.html");
		}
		

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("i am in server program post");
	}
}
