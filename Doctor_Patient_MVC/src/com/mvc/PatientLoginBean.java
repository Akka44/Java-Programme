package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mvc.ConnectionEx;

public class PatientLoginBean {
	private String email;
	private String password;
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
	public PatientRegisterBean loginValidate(String email,String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connectivity();
		PreparedStatement ps=con.prepareStatement("select * from patient where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		PatientRegisterBean prb=new PatientRegisterBean();
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
	      prb.setId(rs.getInt("id"));
	      prb.setName(rs.getString("name"));
	      prb.setEmail(rs.getString("email"));
	      prb.setAddress(rs.getString("address"));
	      prb.setDisease(rs.getString("disease"));
	      prb.setPhone(rs.getLong("phone"));
	      return prb;
		}else {
		    return null;
		}   
	}
}

