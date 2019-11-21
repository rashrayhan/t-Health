package com.thealth.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.thealth.Model.Queue;

public class UpdatePatientVital {
	OpenConnection connection=null;
	// connection object
	Connection con;
	PreparedStatement st;
	String sqlPatientUpdate="UPDATE patient SET vital_info_id =? WHERE idPatient = ?";
	//String sqlSelectStudentData="Select * FROM student where student_id=? ORDER BY student_id ASC";
	
	
	public UpdatePatientVital() {
		
		this.connection=OpenConnection.getInstance();
	}

	
	public int updatePatientData(int pid, int vitalid) {
		// TODO Auto-generated method stub

		try {
			con=connection.getResource().getConnection();
			st = con.prepareStatement(sqlPatientUpdate);
			
			st.setInt(1, vitalid);
			st.setInt(2, pid);
			int rs=st.executeUpdate();
			return rs;
	}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("no data to select");
				e.printStackTrace();
			}
		return 0;
	}
	
	
}

	
	


