package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ViewAppointmentBean {
	private int id;
	private String patient_name;
	private long phone;
	private String email;
	private String gender;
	private String blood_group;
	private String specialist;
	private String date_of_appointment ;
	private String time_of_appointment ;
	private String doctor_name;
	private String status;
	private int pid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patient_name;
	}
	public void setPatientName(String patient_name) {
		this.patient_name = patient_name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getDate_of_appointment() {
		return date_of_appointment;
	}
	public void setDate_of_appointment(String date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}
	public String getTime_of_appointment() {
		return time_of_appointment;
	}
	public void setTime_of_appointment(String time_of_appointment) {
		this.time_of_appointment = time_of_appointment;
	}
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
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public List<ViewAppointmentBean> view(String specialist) throws Exception {
		Connection con=ConnectionEx.connectivity();
		PreparedStatement ps=con.prepareStatement("select * from appointment where specialist=?");
		ps.setString(1,specialist);
		ResultSet rs=ps.executeQuery();
		ArrayList<ViewAppointmentBean> l=new ArrayList<>();
		while(rs.next()){
			ViewAppointmentBean ab=new ViewAppointmentBean();
			ab.setId(rs.getInt(1));
			ab.setPatientName(rs.getString(2));
			ab.setPhone(rs.getLong(3));
			ab.setEmail(rs.getString(4));
			ab.setGender(rs.getString(5));
			ab.setBlood_group(rs.getString(6));
			ab.setSpecialist(rs.getString(7));
			ab.setDate_of_appointment(rs.getString(8));
			ab.setTime_of_appointment(rs.getString(9));
			
			ab.setStatus(rs.getString(10));
			ab.setDoctorName(rs.getString(11));
			l.add(ab);
		}
		return l;
	}
	
}