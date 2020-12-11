package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorUpdateBean {	
private int id;
private String name;
private String email;
private long phone;
private String specialisation;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getSpecialisation() {
	return specialisation;
}
public void setSpecialisation(String specialisation) {
	this.specialisation = specialisation;
}
  
public DoctorRegisterBean update(int id, String name, String email, Long mobile, String specialisation) throws ClassNotFoundException, SQLException {
	Connection con=ConnectionEx.connectivity();
	String sql="update doctor set name=?,email=?,phone=?,specialisation=? where id=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1,name);
	ps.setString(2, email);
	ps.setLong(3, mobile);
	ps.setString(4, specialisation);
	ps.setInt(5, id);
	int x=ps.executeUpdate(); 
	DoctorRegisterBean dr=new DoctorRegisterBean();
	if(x==1) {
		String sq="select * from doctor where id=?";
		ps=con.prepareStatement(sq);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if (rs.next()) {
			dr.setId(rs.getInt("id"));
			dr.setName(rs.getString("name"));
			dr.setEmail(rs.getString("email"));
			dr.setPhone(rs.getLong("phone"));			
			dr.setSpecialisation(rs.getString("specialisation"));
			return dr;
		}else {
			return null;
		}
	}else
	    return null;
  }
}
