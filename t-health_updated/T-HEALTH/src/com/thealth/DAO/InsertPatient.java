package com.thealth.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.thealth.Model.Patient;
import com.thealth.Model.Queue;
import com.thealth.Model.Student;

public class InsertPatient {
	OpenConnection connection=null;
	// connection object
	Connection con;
	PreparedStatement st;
	String sqlinsert="INSERT INTO patient (student_id,visit_date) VALUES (?,?)";
	String sqlPatient="Select idPatient FROM patient where student_id=? and visit_date=? ";
	
	private int id=0;
	
public int getId() {
		
		return this.id;
	}

public InsertPatient() {
	
	this.connection=OpenConnection.getInstance();
}

public int insertPatientdata(Patient patient) {
	
	try {
		con=connection.getResource().getConnection();

		st = con.prepareStatement(sqlinsert);
		int id=patient.getStudent().getStudentId();
		String date=patient.getWalkInDate();
		st.setInt(1,id);
		st.setString(2,date );
		int flag = st.executeUpdate();
		
		if(flag>=0) {
			return getPatientId(date,id);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("can not insert");
		e.printStackTrace();
	}
	return 0;
}

private int getPatientId(String date, int id2) {
	// TODO Auto-generated method stub
	
	int patientid=0;
	try {
		con=connection.getResource().getConnection();
		st = con.prepareStatement(sqlPatient);
		st.setInt(1, id2);
		st.setString(2,date );
		ResultSet rs=st.executeQuery();
		if(rs.next()) {
			patientid= rs.getInt("idPatient");
			return patientid;
			
		}
		
	}
	
	 catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no data to select");
			e.printStackTrace();
			return patientid;
		}
	
	return patientid;
	
}

}