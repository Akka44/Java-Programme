package com.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.DoctorRegisterBean;

public class DoctorRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name=request.getParameter("name");
	    String password=request.getParameter("password");
	    String email=request.getParameter("email");
	    String phone=request.getParameter("phone");
	    long mobile=Long.parseLong(phone);
	    String specialisation=request.getParameter("specialisation");
	    
	    PrintWriter pw=response.getWriter();
	    
	    DoctorRegisterBean rb=new DoctorRegisterBean();
	    rb.setName(name);
	    rb.setPassword(password);
	    rb.setEmail(email);
	    rb.setPhone(mobile);
	    rb.setSpecialisation(specialisation);
	    HttpSession hs=request.getSession();
	    hs.setAttribute("rbean", rb);
	    boolean status=false;
	    pw.println("<html> <body bgcolor='wheat'><center><h1>");
	    try {
			status= rb.registerValidate(name,password,email,specialisation,mobile);			
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    if(status) {
	    	pw.println("Doctor registered successfully");
	    }
	    else {
	    	pw.println("Doctor registeration failed");
	    }
	}    
}