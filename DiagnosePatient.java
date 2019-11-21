package com.thealth.DAO.Auth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.thealth.DAO.OpenConnection;

import model.Diagnosis;

public class DiagnosePatient {

//	private Diagnosis
	OpenConnection connection=null;
	Connection con;
	
	String query = "insert into diagnosis(Symptoms,Findings,currentmedication,Treatment,prescription_id) values (?,?,?,?,?)";
	
	public DiagnosePatient() {
		this.connection=OpenConnection.getInstance();
	}
	
	public int makeDiagnosis(Diagnosis d) {
		try {
			con=connection.getResource().getConnection();
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, d.getSymptoms());
			st.setString(2, d.getFinding());
			st.setString(3, d.getCurrentMedication());
			st.setString(4, d.getTreatment());
			st.setInt(5, d.getPrescription_id());
			return st.executeUpdate();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
		
	}
}
