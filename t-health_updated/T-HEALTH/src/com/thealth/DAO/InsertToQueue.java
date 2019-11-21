package com.thealth.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.thealth.Model.Queue;
import com.thealth.Model.VitalInfo;

public class InsertToQueue {
	
	OpenConnection connection=null;
	// connection object
	Connection con;
	PreparedStatement st;
	String sql="INSERT INTO patient_queue (student_id,symptoms,time) VALUES (?, ?, ?)";
	
	
	private int id=0;
	
public int getId() {
		
		return this.id;
	}

public InsertToQueue() {
	
	this.connection=OpenConnection.getInstance();
}

public int insertdata(Queue queue) {
	
	try {
		con=connection.getResource().getConnection();

		st = con.prepareStatement(sql);
		st.setInt(1,queue.getStid());
		st.setString(2, queue.getSymptoms());
		st.setString(3, queue.getTime());
		
		int flag = st.executeUpdate();
		return flag;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("can not insert");
		e.printStackTrace();
	}
	return 0;
}
}
