package com.thealth.Model;

import java.time.LocalDate;

public class Patient {
	private int patientId;
	private Users user;
	private Student student;
	private VitalInfo vitalInfo;
	private String walkInDate;
	
	public Patient(int patientId, Users user, Student student, VitalInfo vitalInfo, String walkInDate) {
		super();
		this.patientId = patientId;
		this.user = user;
		this.student = student;
		this.vitalInfo = vitalInfo;
		this.setWalkInDate(walkInDate);
	}

	public Patient() {
		
	}
	

	public int getIdPatient() {
		return patientId;
	}

	public void setIdPatient(int patientId) {
		this.patientId = patientId;
	}

	public int getUserId() {
		return user.getUserid();
	}


	public void setUserId(Users user) {
		this.user = user;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getVitalInfoId() {
		return vitalInfo.getVitalInfoId();
	}

	public void setVitalInfoId(VitalInfo vitalInfo) {
		this.vitalInfo = vitalInfo;
	}
	
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", userId=" + this.getUserId() + ", studentId=" + student + ", vitalInfoId="
				+ vitalInfo + "]";
	}

	public String getWalkInDate() {
		return walkInDate;
	}

	public void setWalkInDate(String walkInDate) {
		this.walkInDate = walkInDate;
	}
}
