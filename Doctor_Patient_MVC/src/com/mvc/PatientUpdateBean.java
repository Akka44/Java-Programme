package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientUpdateBean {
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;
	private String disease;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease=disease;
	}
	public PatientRegisterBean update(int id, String name, String email, long phone, String address,String disease) throws Exception {
		Connection con = ConnectionEx.connectivity();
		String sql = "update patient set name=?,email=?,phone=?,address=?,disease=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setLong(3, phone);
		ps.setString(4, address);
		ps.setString(5,disease);
		ps.setInt(6, id);
		int a = ps.executeUpdate();
		PatientRegisterBean prb = new PatientRegisterBean();
		if (a != 0) {
			sql = "select * from patient where id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				prb.setId(rs.getInt("id"));
				prb.setName(rs.getString("name"));
				prb.setEmail(rs.getString("email"));
				prb.setPhone(rs.getInt("phone"));
				prb.setAddress(rs.getString("address"));
				prb.setDisease(rs.getString("disease"));
				return prb;
			}else {
				return null;
			}
		} else
			return null;
		
	}
}