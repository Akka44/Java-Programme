package com.mvc;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DoctorUpdateController extends HttpServlet{
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	 int id=Integer.parseInt(request.getParameter("id"));
    	 String name=request.getParameter("name");
    	 String email=request.getParameter("email");
    	 Long mobile=Long.parseLong(request.getParameter("phone"));
    	 String specialisation=request.getParameter("specialisation");
    	 DoctorUpdateBean ub=new DoctorUpdateBean();    	    	
    	 ub.setId(id);
    	 ub.setEmail(email);
    	 ub.setName(name);
    	 ub.setPhone(mobile);
    	 ub.setSpecialisation(specialisation);
    	 HttpSession hs=request.getSession();
    	 DoctorRegisterBean rb=null;
 		try {
 			rb = ub.update(id, name, email, mobile, specialisation);
 		} catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		if(rb!=null) {
 			    hs.setAttribute("doctorDetails", rb);
 			    response.sendRedirect("./doctor_profile.jsp?msg=updated sucessfully");
 		}else
 			response.sendRedirect("./update_doctor_profile.jsp?msg=updated failed");
 	}
}
