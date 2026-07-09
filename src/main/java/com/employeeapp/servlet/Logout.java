package com.employeeapp.servlet;

import java.io.IOException;

import com.empapp.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/logout")
public class Logout  extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		Employee e=(Employee)session.getAttribute("employee");
		
		if(e!=null) {
			session.invalidate();  // will terminate the session
			req.setAttribute("sucess","Logout Sucessfully");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
			
		}else {
			req.setAttribute("error","Session Already Expired");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
	}
   	
	
}
