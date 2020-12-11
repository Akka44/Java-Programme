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

	public class DoctorLoginController extends HttpServlet {
		private static final long serialVersionUID = 1L;
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    String password=request.getParameter("password");
		    String email=request.getParameter("email");
		    
		    PrintWriter pw=response.getWriter();
		    
		    DoctorLoginBean lb=new DoctorLoginBean();	    
		    HttpSession hs=request.getSession();	    
		    pw.println("<html> <body bgcolor='wheat'><center><h1>");
		    DoctorRegisterBean rb=null;
		    try {
				rb= lb.loginValidate(email,password);			
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
			if(rb!=null) {
		    	hs.setAttribute("doctorDetails", rb);
		    	hs.setAttribute("sid",  rb.getId());
		    	response.sendRedirect("./doctor_home.html?msg=loggedin");
		    }
		    else {
		    	response.sendRedirect("./doctor_login.html?msg=failed");
		    }
		    pw.println("</h1></center></body></html>");
		}    
}
