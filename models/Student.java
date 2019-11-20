package model;

import java.time.LocalDate;

public class Student {
	enum Gender{MALE, FEMALE}
	private int id;
	private int studentId;
	private String firstName;
	private String LastName;
	private String email;
	private LocalDate dob;
	private String phone;
	
	
	public Student() {
	}
	public Student(int id, int studentId, String firstName, String lastName, String email, LocalDate dob,
			String phone) {
		this.id = id;
		this.studentId = studentId;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
