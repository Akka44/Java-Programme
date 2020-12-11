<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat"></body>
<body bgcolor="wheat">
<br><br><br>
<center><h1>Welcome to Patient Home</h1></center>
<a href="patient_home.html"><h2>Home<h2></a>
<a href="patient_profile.jsp">Profile</a>
<a href="view_appointment.jsp">Appointment</a>
<a href="patient_login.html">Patient_login</a>
<%@ page import="com.mvc.PatientRegisterBean"%>
<table border="2" align="center" width="600" height="200" cellpadding="10">
<tr>
    <td>Id</td>
    <td>Name</td>
    <td>Email</td>
    <td>Phone</td>
    <td>address</td>
    <td>disease</td>
    <td>Action</td>
</tr>
<% 
  PatientRegisterBean pr=(PatientRegisterBean)session.getAttribute("patientDetails"); 
%>
<tr>
<td><%=pr.getId() %></td>
<td><%=pr.getName() %></td>
<td><%=pr.getEmail() %></td>
<td><%=pr.getPhone() %></td>
<td><%=pr.getAddress() %></td>
<td><%=pr.getDisease() %></td>
<td><a href="update_patient_profile.jsp?id=<%=pr.getId()%>">Update</a></td>
</tr>
</table>
</body>
</html>