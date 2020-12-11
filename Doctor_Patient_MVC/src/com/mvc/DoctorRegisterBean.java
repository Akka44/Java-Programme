package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.ConnectionEx;

public class DoctorRegisterBean {
   private String name,password,email,specialisation;
   private long phone;
   private int id;
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSpecialisation() {
	return specialisation;
}
public void setSpecialisation(String specialisation) {
	this.specialisation = specialisation;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
   
public boolean registerValidate(String name,String password,String email,String specialisation,long phone) throws ClassNotFoundException, SQLException {
	Connection con=ConnectionEx.connectivity();
	PreparedStatement ps=con.prepareStatement("insert into doctor(name,password,email,phone,specialisation) values(?,?,?,?,?)");
	ps.setString(1, name);
	ps.setString(2, password);
	ps.setString(3, email);
	ps.setLong(4, phone);
	ps.setString(5, specialisation);
	if(ps.executeUpdate()==1){
		return true;
	}else {
	    return false;
	}    
}
}
