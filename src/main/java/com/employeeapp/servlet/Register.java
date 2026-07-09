package com.employeeapp.servlet;

import java.io.IOException;

import com.empapp.dao.Employeedao;
import com.empapp.dao.impl.Employeeimpl;
import com.empapp.dto.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/registerpage")

public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		Employee e=new Employee();
		Employeedao edao = new Employeeimpl();
		
		e.setName(req.getParameter("name"));
		e.setJob(req.getParameter("job"));
		e.setSalary(Double.parseDouble(req.getParameter("salary")));
		e.setDno (Integer.parseInt(req.getParameter("Department")));
		e.setEmail(req.getParameter("mail"));
		e.setPass(req.getParameter("pass"));
		
		edao.addemployee(e);
		req.setAttribute("sucess","Employee Added Sucessfully");
		RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
		rd.forward(req, resp);
		
		
		
	}
	

}
