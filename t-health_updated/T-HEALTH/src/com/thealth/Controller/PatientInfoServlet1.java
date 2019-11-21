package com.thealth.Controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thealth.DAO.InsertPatient;
import com.thealth.DAO.Auth.CheckinPatient;
import com.thealth.Model.Patient;
import com.thealth.Model.Student;

/**
 * Servlet implementation class PatientInfoServlet1
 */
@WebServlet("/PatientInfoServlet1")
public class PatientInfoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CheckinPatient checkin=new CheckinPatient(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientInfoServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer patient = (Integer) request.getAttribute("p-id");
		LocalDateTime date=LocalDateTime.now();
		String dt=	date.toString();
		int stid= (int) patient;
		
		
		Student patientdata=checkin.check(stid);
		
		if(patientdata!=null) {
			Patient patient2=new Patient();
			patient2.setStudent(patientdata);
			patient2.setWalkInDate(dt);	
		//	InsertPatient insertpatient=new InsertPatient();
			//int pid=insertpatient.insertPatientdata(patient2);
			
		//	System.out.println(pid);
			
		///	if( pid>0) {
		//		request.getServletContext().setAttribute("pid", pid);
		//	}
			request.setAttribute("student_id", stid);
			request.setAttribute("patientdata", patientdata);
			request.getRequestDispatcher("patient.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
