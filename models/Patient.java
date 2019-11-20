package model;

import java.time.LocalDate;

public class Patient {
	private int patientId;
	private User user;
	private Student student;
	private VitalInfo vitalInfo;
	private LocalDate walkInDate;
	
	public Patient(int patientId, User user, Student student, VitalInfo vitalInfo, LocalDate walkInDate) {
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
		return user.getUserId();
	}


	public void setUserId(User user) {
		this.user = user;
	}

	public int getStudentId() {
		return student.getStudentId();
	}

	public void setStudentId(Student student) {
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

	public LocalDate getWalkInDate() {
		return walkInDate;
	}

	public void setWalkInDate(LocalDate walkInDate) {
		this.walkInDate = walkInDate;
	}
}
