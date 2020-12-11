package com.mvc;

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.SQLException;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	import com.mvc.PatientRegisterBean;

	public class PatientRegisterController extends HttpServlet {
		private static final long serialVersionUID = 1L;
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    String name=request.getParameter("name");
		    String password=request.getParameter("password");
		    String email=request.getParameter("email");
		    String phone=request.getParameter("phone");
		    long mobile=Long.parseLong(phone);
		    String address=request.getParameter("address");
		    String disease=request.getParameter("disease");
		    
		    PrintWriter pw=response.getWriter();
		    
		    PatientRegisterBean prb=new PatientRegisterBean();	    
		    prb.setName(name);
		    prb.setPassword(password);
		    prb.setEmail(email);
		    prb.setAddress(address);
		    prb.setDisease(disease);
		    prb.setPhone(mobile);
		    boolean status=false;
		    pw.println("<html> <body bgcolor='wheat'><center><h1>");
		    try {
				status= prb.registerValidate(name,password,email,mobile,address,disease);			
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    if(status) {
		    	pw.println("Patient registered successfully");
		    }
		    else {
		    	pw.println("Patient registeration failed");
		    }    
	}
}
