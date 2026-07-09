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



@WebServlet("/forgotPassword")
public class Forgotpassword extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Employeedao edao =new Employeeimpl();
		
		String mail=req.getParameter("mail");
		String password=req.getParameter("pass");
		String confirm=req.getParameter("confirm");
		
		Employee e= edao.findByEmail(mail);
		
		if(e!=null) {
		
		        if(password.equals(confirm))
		         {
			      e.setPass(req.getParameter("pass"));
			      edao.updateEmployee(e);
			      req.setAttribute("sucess", "Password Updated Sucessfully");
			      req.getRequestDispatcher("login.jsp").forward(req, resp);
			      
			
		          }
		         else{
		        	 
		        	 req.setAttribute("error", "Password Mismatch ");
				 req.getRequestDispatcher("forgetpassword.jsp").forward(req, resp);
			
		          }
		
		}
		else {
			
			 req.setAttribute("error", "Data Does not Exists ");
		     req.getRequestDispatcher("forgetpassword.jsp").forward(req, resp);
			
		}
	}
	
}
