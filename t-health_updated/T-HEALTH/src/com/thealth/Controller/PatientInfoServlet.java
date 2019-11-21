package com.thealth.Controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thealth.DAO.InsertPatient;
import com.thealth.DAO.Auth.CheckinPatient;
import com.thealth.Model.Patient;
import com.thealth.Model.Student;

/**
 * Servlet implementation class PatientInfoServlet
 */
@WebServlet(name="PatientInfoServlet", urlPatterns= {"/PatientInfoServlet"})
public class PatientInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CheckinPatient checkin=new CheckinPatient();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer patient = (Integer) getServletContext().getAttribute("p-id");
		LocalDateTime date=LocalDateTime.now();
		String dt=	date.toString();
		int stid= (int) patient;
		
		
		Student patientdata=checkin.check(stid);
		
		if(patientdata!=null) {
			Patient patient2=new Patient();
			patient2.setStudent(patientdata);
			patient2.setWalkInDate(dt);	
			InsertPatient insertpatient=new InsertPatient();
			int pid=insertpatient.insertPatientdata(patient2);
			
			System.out.println(pid);
			
			if( pid>0) {
				request.getServletContext().setAttribute("pid", pid);
			}
			request.setAttribute("student_id", stid);
			request.setAttribute("patientdata", patientdata);
			request.getRequestDispatcher("patient.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String patientid = request.getParameter("p-id");
		if(patientid == "" ) {
			request.setAttribute("msg", "Input fields not allowed");
			request.getRequestDispatcher("NurseCheckinServlet").forward(request, response);
		}
		else {
		int stid= Integer.parseInt(patientid);
		Student patientdata=checkin.check(stid);
		LocalDateTime date=LocalDateTime.now();
		String dt=	date.toString();
		
		if(patientdata!=null) {
			Patient patient=new Patient();
			patient.setStudent(patientdata);
			patient.setWalkInDate(dt);	
			InsertPatient insertpatient=new InsertPatient();
			int pid=insertpatient.insertPatientdata(patient);
			
			System.out.println("patient id set by petient info"+pid);
			
			if( pid>0) {
				request.getServletContext().setAttribute("pid", pid);
				request.setAttribute("patientdata", patientdata);
				request.getRequestDispatcher("patient.jsp").forward(request, response);
			
				
				}
		request.setAttribute("patientdata", patientdata);
		request.getRequestDispatcher("patient.jsp").forward(request, response);
	
		}
		}
	}

}
