package com.mvc;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PatientUpdateController extends HttpServlet{
  public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
   int id=Integer.parseInt(request.getParameter("id"));
   String name=request.getParameter("name");
   String email=request.getParameter("email");
   String phone=request.getParameter("phone");
   long mobile=Long.parseLong(phone);
   String address=request.getParameter("address");
   String disease=request.getParameter("disease");

  boolean status=false;
  PatientUpdateBean pub=new PatientUpdateBean();
  pub.setId(id);
  pub.setName(name);
  pub.setEmail(email);
  pub.setPhone(mobile); 
  pub.setAddress(address);
  pub.setDisease(disease);
  HttpSession hs=request.getSession();
  PatientRegisterBean pr=null;
  try {
	pr = pub.update(id, name, email, mobile,address,disease);
  } catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
  }
  if(pr!=null) {
	    hs.setAttribute("patientDetails", pr);
	    response.sendRedirect("patient_profile.jsp?msg=updated sucessfully");
  }else
	response.sendRedirect("./update_patient_profile.jsp?msg=updated failed");
}

}