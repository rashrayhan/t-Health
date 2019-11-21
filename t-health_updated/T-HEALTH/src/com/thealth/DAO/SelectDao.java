package com.thealth.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.thealth.Model.Queue;
import com.thealth.Model.VitalInfo;

public class SelectDao {

	OpenConnection connection=null;
	// connection object
	Connection con;
	PreparedStatement st;
	String sqlPatientQueue="Select * FROM patient_queue ORDER BY queueid ASC";
	//String sqlSelectStudentData="Select * FROM student where student_id=? ORDER BY student_id ASC";
	
	
	public SelectDao() {
		
		this.connection=OpenConnection.getInstance();
	}

public List<Queue> sqlPatientQueueSelect() {
	
	List<Queue> list=new ArrayList<>();
	try {
		con=connection.getResource().getConnection();
		st = con.prepareStatement(sqlPatientQueue);
		
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
			Queue temp1=new Queue();
			temp1.setStid((Integer.parseInt(rs.getString("student_id"))));
			temp1.setSymptoms(rs.getString("symptoms"));
			temp1.setTime(rs.getString("time"));
			list.add(temp1);
			
		}
		return list;
	}
	
	 catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no data to select");
			e.printStackTrace();
		}
	
	return list;
	
}

	
}
