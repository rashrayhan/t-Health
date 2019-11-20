package model;

public class Patient {
	private int patientId;
	private User user;
	private Student student;
	private VitalInfo vitalInfo;
	
	public Patient() {
		
	}
	
	public Patient(int patientId, User user, Student student, VitalInfo vitalInfo) {
		this.patientId = patientId;
		this.user = user;
		this.student = student;
		this.vitalInfo = vitalInfo;
		
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
}
