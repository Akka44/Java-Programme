package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AcceptBean {
	public String doctor_name;
	public String status;
	public int aid;
	public String getDoctorName() {
		return doctor_name;
	}
	public void setDoctorName(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public boolean accept(String doctor_name, int aid) throws Exception {
		Connection  con=ConnectionEx.connectivity();
		String sql = "update appointment set status=?,doctor_name=? where aid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "Accepted");
		ps.setString(2, doctor_name);
		ps.setInt(3, aid);
		int a = ps.executeUpdate();
		if(a!=0)
			return true;
		else
			return false;
	}
	
}
