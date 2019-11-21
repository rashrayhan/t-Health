package com.thealth.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.thealth.Model.VitalInfo;

public class InsertVital {

	OpenConnection connection=null;
	// connection object
	Connection con;
	PreparedStatement st;
	String sql="INSERT INTO vital_info (weight, height, body_temp, blood_pressure, heart_rate,oxygen_level,date) VALUES (?, ?, ?, ?,?,?, ?)";
	String sqlvitalid="SELECT MAX(vital_info_id) FROM vital_info";
	
	private int id=0;
	
public int getId() {
		
		return this.id;
	}

public InsertVital() {
	
	this.connection=OpenConnection.getInstance();
}

public int insertVitaldata(VitalInfo vital) {
	Date date=null;
	int vitalid=0;
	try {
		con=connection.getResource().getConnection();

		st = con.prepareStatement(sql);
		st.setString(1, vital.getWeight());
		st.setString(2, vital.getHeight());
		st.setString(3, vital.getBodyTemp());
		st.setString(4, vital.getBloodPressure());
		st.setString(5, vital.getHeartRate());
		st.setString(6, vital.getOxygen_level());
		date=Date.valueOf(vital.getVisit_date());
		st.setDate(7, date);

		int flag = st.executeUpdate();
		
		if(flag>0) {
			st = con.prepareStatement(sqlvitalid);
			ResultSet rs=st.executeQuery();
			
			if(rs.next()) {
				System.out.println("vital id"+ vitalid);
				vitalid= rs.getInt("max(vital_info_id)");
				return vitalid;
			}
			else {
				
				System.out.println("vital id"+ vitalid);
			}
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("can not insert vital info");
		e.printStackTrace();
	}
	return 0;
}
}
