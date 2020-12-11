package com.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.DoctorLoginBean;
import com.mvc.PatientLoginBean;

public class PatientLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String password=request.getParameter("password");
	    String email=request.getParameter("email");
	    
	    PrintWriter pw=response.getWriter();
	    
	    PatientLoginBean lb1=new PatientLoginBean();	    
	    HttpSession hs=request.getSession();
	    PatientRegisterBean prb=null;
	    pw.println("<html> <body bgcolor='wheat'><center><h1>");
	    try {
			prb= lb1.loginValidate(email,password);			
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    if(prb!=null) {
	    	hs.setAttribute("patientDetails",prb);
	    	hs.setAttribute("sid",  prb.getId());
	    	response.sendRedirect("./patient_home.html?msg=loggedin");
	    }
	    else {
	    	response.sendRedirect("./patient_login.html?msg=failed");
	    }
	    pw.println("</h1></center></body></html>");
	}    
}

