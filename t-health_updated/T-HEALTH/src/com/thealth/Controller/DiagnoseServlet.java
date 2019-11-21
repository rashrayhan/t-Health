package com.thealth.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thealth.DAO.DiagnosePatient;
import com.thealth.DAO.UpdatePatientVital;
import com.thealth.Model.Diagnosis;



@WebServlet(name="DiagnoseServlet" ,urlPatterns= {"/DiagnoseServlet"})
public class DiagnoseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Diagnosis d = new Diagnosis();
	DiagnosePatient dp = new DiagnosePatient();
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		d.setCurrentMedication(request.getParameter("medication"));
		d.setFinding(request.getParameter("findings"));
	//	d.setPrescription_id(Integer.parseInt(request.getParameter("prescreptionId")));
		d.setSymptoms(request.getParameter("symptoms"));
		d.setTreatment(request.getParameter("treatment"));
		
		int pid=(int) request.getServletContext().getAttribute("pid");
		System.out.println("insert vital info servlet"+ pid);
		
		int ret = dp.makeDiagnosis(d);
		if(ret>=0) {
			UpdatePatientVital updatepatient=new UpdatePatientVital();
			request.setAttribute("vitalinfo", d);
			int res=updatepatient.updatePatientData(pid,ret);
			//System.out.println(res);
			// put code here where it takes you back to the form
			response.sendRedirect("PatientInfoServlet");
		}
		
	}

}
