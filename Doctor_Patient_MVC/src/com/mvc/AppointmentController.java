package com.mvc;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AppointmentController extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	String patient_name=request.getParameter("pname");
    	long mobile=Long.parseLong(request.getParameter("phone"));
    	String  email=request.getParameter("email");
    	String gender=request.getParameter("gender");
    	String blood_group=request.getParameter("blood_group");
    	String specialist=request.getParameter("specialist");
		String date_of_appointment = request.getParameter("date_of_appointment");
		String time_of_appointment = request.getParameter("time_of_appointment");
		HttpSession hs=request.getSession();
		int pid=(Integer)hs.getAttribute("sid");
		boolean status=false;
		
		try {
			status=new AppointmentBean().apply(patient_name,mobile,email,gender,blood_group, specialist, date_of_appointment, time_of_appointment, pid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("appointment.jsp?msg=applied sucessfully");
		else
			response.sendRedirect("appointment.jsp?msg=applied failed");
	}
}
