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
import jakarta.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 Employee  e= new Employee();
		 
		Employeedao edao=new Employeeimpl();
		
		String mail= req.getParameter("mail");
	    String pass=req.getParameter("pass");
	    
	    e= edao.findEmailAndPassword(mail, pass);
	      
	   
	    if(e!=null) {
	    	
	    	HttpSession session=req.getSession();
	    	session.setAttribute("employee", e);

	    if("HR".equals(e.getJob())) {
	    	resp.sendRedirect("admin.jsp");    
	    	
	    }else {
			
			 req.setAttribute("sucesslogin", e);
			 RequestDispatcher rp = req.getRequestDispatcher("dashbord.jsp");
			 rp.forward(req,resp);
	    	}
	    }
	    else {
	    	req.setAttribute("sucesslogin", "Loged In Unsucessfully");
			 RequestDispatcher rp = req.getRequestDispatcher("login.jsp");
			 rp.forward(req,resp);
	    	
	    }
	
	}

}
