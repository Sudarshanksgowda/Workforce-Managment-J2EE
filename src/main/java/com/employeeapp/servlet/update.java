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


@WebServlet("/update")
public class update extends HttpServlet {
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Employeedao edao=new Employeeimpl();
	     
		HttpSession session=req.getSession();
		Employee e=(Employee)session.getAttribute("employee");
		
		
		if(e.getId()==(Integer.parseInt(req.getParameter("eid")))){
		
		e.setName(req.getParameter("name"));
		e.setEmail(req.getParameter("email"));
		e.setPass(req.getParameter("password"));
		
		if(e.getJob().equals("HR")) {
	
		
		e.setJob(req.getParameter("job"));
		e.setSalary(Double.parseDouble(req.getParameter("sal")));
		
		}
		
         edao.updateEmployee(e);
		}
      
      if(e!=null) {
    	  req.setAttribute("sucess", "Updated Sucessfully");
    	  req.getRequestDispatcher("update.jsp").forward(req, resp);
		
      }else {
    	  req.setAttribute("error", "Updated unsucess");
    	  req.getRequestDispatcher("update.jsp").forward(req, resp);
    	  
      }
	
	}
}
