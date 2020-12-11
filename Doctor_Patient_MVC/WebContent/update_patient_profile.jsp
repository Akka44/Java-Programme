<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Patient Update Page</h1>
		<br> <br> <a href="patient_home.html">Home</a> | <a
			href="patient_profile.jsp">Profile</a> | <a href="index.html">Logout</a>
	</center>
	<br>
	<br>
	<%@page import="com.mvc.PatientRegisterBean" %>
	<%
	PatientRegisterBean prb=(PatientRegisterBean)session.getAttribute("patientDetails");
	if (prb!=null) {
	%>
	<form action="patient_update" method="post" align="center">
		<input type="hidden" name="id" value="<%=prb.getId()%>">
		<input type="text" name="name" value="<%=prb.getName()%>">
		<input type="email" name="email" value="<%=prb.getEmail()%>"> 
		<input type="number" name="phone" value="<%=prb.getPhone()%>">
		<input type="text" name="address" value="<%=prb.getAddress()%>">
		<input type="text" name="disease" value="<%=prb.getDisease()%>"> 
		<br> <br> <input type="submit" value="update">
	</form>
	<%
		}
	%>
</body>
</html>