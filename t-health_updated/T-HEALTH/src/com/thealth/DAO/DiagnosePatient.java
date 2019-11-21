package com.thealth.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.thealth.DAO.OpenConnection;



public class DiagnosePatient {

//	private Diagnosis
	OpenConnection connection=null;
	Connection con;
	
	String query = "insert into diagnosis(Symptoms,Findings,currentmedication,Treatment) values (?,?,?,?)";
	String sqldiagnosisid="SELECT MAX(diagnosis_id) FROM diagnosis";
	public DiagnosePatient() {
		this.connection=OpenConnection.getInstance();
	}
	
	public int makeDiagnosis(com.thealth.Model.Diagnosis d) {
		int diagnosis_id=0;
		try {
			con=connection.getResource().getConnection();
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, d.getSymptoms());
			st.setString(2, d.getFinding());
			st.setString(3, d.getCurrentMedication());
			st.setString(4, d.getTreatment());
			
			int flag= st.executeUpdate();
			if(flag>0) {
				st = con.prepareStatement(sqldiagnosisid);
				ResultSet rs=st.executeQuery();
				
				if(rs.next()) {
					System.out.println("vital id"+ diagnosis_id);
					diagnosis_id= rs.getInt("max(diagnosis_id)");
					return diagnosis_id;
				}
				else {
					
					System.out.println("vital id"+ diagnosis_id);
				}
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
		
	}
}
