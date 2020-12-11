<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="wheat">
<br><br><br>
<center><h1>Welcome to Doctor Home</h1></center>
<a href="doctor_home.html"><h2>Home<h2></a> |
<a href="doctor_profile.jsp">Profile</a> |
<a href="index.html">Logout</a>
<br><br><br>
<%@page import="com.mvc.DoctorRegisterBean" %>
	<%
		DoctorRegisterBean rb=(DoctorRegisterBean)session.getAttribute("doctorDetails");
	    if(rb!=null){
	%>
	 <form action="doctor_update" method="post" align="center">
       <input type="hidden" name="id" value="<%=rb.getId()%>">
       <input type="text" name="name" value="<%=rb.getName()%>">
       <input type="text" name="email" value="<%=rb.getEmail()%>">
       <input type="number" name="phone" value="<%=rb.getPhone()%>">
        <select name="specialisation">
    <option value="<%=rb.getSpecialisation() %>"><%=rb.getSpecialisation() %></option>
    <option value="DENTIST">DENTIST</option>
    <option value="ENT">ENT</option>
    <option value="CARDIAOLIGIST">CARDIAOLIGIST</option>
  </select>
  <br><br><br>
  <center>
  <input type="submit" value="Update">
  </center>
</form>  
<%} %>
</body>
</html>