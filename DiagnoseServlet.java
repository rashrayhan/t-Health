package com.thealth.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thealth.DAO.Auth.DiagnosePatient;

import model.Diagnosis;

@WebServlet("/DiagnoseServlet")
public class DiagnoseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Diagnosis d = new Diagnosis();
	DiagnosePatient dp = new DiagnosePatient();
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		d.setCurrentMedication(request.getParameter("medication"));
		d.setFinding(request.getParameter("finding"));
	//	d.setPrescription_id(Integer.parseInt(request.getParameter("prescreptionId")));
		d.setSymptoms(request.getParameter("symptom"));
		d.setTreatment(request.getParameter("treatment"));
		
		int ret = dp.makeDiagnosis(d);
		
	}

}
