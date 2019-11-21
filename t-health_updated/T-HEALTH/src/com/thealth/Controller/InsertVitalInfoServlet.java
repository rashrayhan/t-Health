package com.thealth.Controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thealth.DAO.InsertVital;
import com.thealth.DAO.UpdatePatientVital;
import com.thealth.Model.VitalInfo;

/**
 * Servlet implementation class InsertVitalInfoServlet
 */
@WebServlet(name="InsertVitalInfoServlet", urlPatterns= {"/InsertVitalInfoServlet"})
public class InsertVitalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	VitalInfo vitalinfo=new VitalInfo();
	InsertVital insert=new InsertVital();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String weight=request.getParameter("weight");
		String height=request.getParameter("height");
		String bp=request.getParameter("blood");
		String temp=request.getParameter("temperature");
		String heart_rate=request.getParameter("heart-rate");
		String oxygen_level=request.getParameter("oxygen");
		LocalDate date=LocalDate.now();
		
		//int pid=(int) request.getServletContext().getAttribute("pid");
		//use the hidden field
		int pid=Integer.parseInt(request.getParameter("patient_record_id"));
	
		System.out.println("insert vital info servlet"+ pid);
		
		vitalinfo.setBloodPressure(bp);
		vitalinfo.setBodyTemp(temp);
		vitalinfo.setHeartRate(heart_rate);
		vitalinfo.setHeight(height);
		vitalinfo.setOxygen_level(oxygen_level);
		vitalinfo.setVisit_date(date);
		vitalinfo.setWeight(weight);
		int vitalid=insert.insertVitaldata(vitalinfo);
		if(vitalid>=0) {
			UpdatePatientVital updatepatient=new UpdatePatientVital();
			request.setAttribute("vitalinfo", vitalinfo);
			int res=updatepatient.updatePatientData(pid,vitalid );
			//System.out.println(res);
			// put code here where it takes you back to the form
			// send the patient id to servlet one
			request.setAttribute("patient_record_id", pid);
			request.getRequestDispatcher("PatientInfoServlet1").forward(request, response);
			
		}
		else {
			request.setAttribute("vitalinfo", vitalinfo);
			//put code here where it outputs thank you
			response.sendRedirect("PatientInfoServlet");
			
		}
	}

}
