package com.thealth.DAO.Auth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import com.thealth.DAO.OpenConnection;
import com.thealth.Model.Student;
import com.thealth.Model.Users;

public class CheckinPatient {

	OpenConnection connection=null;
	// connection object
	Connection con;
	String sql="select student_id,student_fname,student_lname,email,dob,phone_number,gender from student where student_id=?";
	
	private int id=0;
	
public int getId() {
		
		return this.id;
	}

public CheckinPatient() {
	
	this.connection=OpenConnection.getInstance();
}
public Student check(int stid) {
	Student student=null;
	
	
	try {
		con=connection.getResource().getConnection();
		
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1, stid);
		
		
		ResultSet rs=stmt.executeQuery();
		if(rs.next()) {
			student=new Student();
			student.setStudentId(rs.getInt("student_id"));
			student.setEmail(rs.getString("email"));
			student.setFirstName(rs.getString("student_fname"));
			student.setLastName(rs.getString("student_lname"));
			student.setDob(rs.getString("dob"));
			student.setPhone(rs.getString("phone_number"));
			student.setGender(rs.getString("gender"));
			
		return student;
		
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return student;
}


public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {

	return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
}

	
}
