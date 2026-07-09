package com.employeeapp.servlet;

import java.io.IOException;

import com.empapp.dao.Employeedao;
import com.empapp.dao.impl.Employeeimpl;
import com.empapp.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/resetPassword")
public class Resetpassword  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Employeedao edao=new Employeeimpl();
		HttpSession session=req.getSession();
		Employee e=(Employee)session.getAttribute("employee");
		
		 if(e.getPass().equals(req.getParameter("currentPassword"))) {
			 
			 if(req.getParameter("newPassword").equals(req.getParameter("confirmPassword"))) {
				 
				 
				 e.setPass(req.getParameter("newPassword"));
				 edao.updateEmployee(e);
				 

				 req.setAttribute("sucess","Password Updated Sucessfully");
				 req.getRequestDispatcher("Resetpassword.jsp").forward(req, resp);
				 
			 }else {
				 
				 req.setAttribute("error","Password Mismatch");
				 req.getRequestDispatcher("Resetpassword.jsp").forward(req, resp);
			 }	 
			 
		 }else {
			 req.setAttribute("error","Password Invalid");
			 req.getRequestDispatcher("Resetpassword.jsp").forward(req, resp);
			 
		 }
	}

}
