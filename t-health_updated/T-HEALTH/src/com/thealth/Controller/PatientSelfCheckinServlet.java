package com.thealth.Controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thealth.DAO.InsertPatient;
import com.thealth.DAO.InsertToQueue;
import com.thealth.DAO.SelectDao;
import com.thealth.DAO.Auth.CheckinPatient;
import com.thealth.Model.Patient;
import com.thealth.Model.Queue;
import com.thealth.Model.Student;

/**
 * Servlet implementation class PatientSelfCheckinServlet
 */
@WebServlet(name="PatientSelfCheckinServlet", urlPatterns= {"/PatientSelfCheckinServlet"})
public class PatientSelfCheckinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CheckinPatient checkin=new CheckinPatient();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SelectDao sqlSelectQueue = new SelectDao();
		List<Queue> res=sqlSelectQueue.sqlPatientQueueSelect();
		request.setAttribute("queueData",res);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idinput=request.getParameter("stid");
		
		String[] symptom=request.getParameterValues("symptoms");
		
		if(idinput == "" || symptom.equals(null)) {
			request.setAttribute("msg", "Input fields not allowed");
			doGet(request, response);
		}else {
			int stid= Integer.parseInt(idinput);
			StringBuilder sb = new StringBuilder();
			
			for (String string : symptom) {
				sb.append(string + ", ");
			}
			LocalDateTime date=LocalDateTime.now();
			String datetime=date.getHour() + ":" + date.getMinute() + ":" + date.getSecond();
			String dt=	date.toString();
			Student student=checkin.check(stid);
			
			if(student!=null) {
				Queue queue = new Queue();
				Patient patient=new Patient();
				patient.setStudent(student);
				patient.setWalkInDate(dt);
				queue.setStid(stid);
				queue.setTime(datetime);
				queue.setSymptoms(sb.toString().substring(0,sb.toString().length()-2));
				InsertToQueue q=new InsertToQueue();
				InsertPatient insertpatient=new InsertPatient();
				
				int result=q.insertdata(queue);
				int patientid=insertpatient.insertPatientdata(patient);
				System.out.println(patientid);
				if(result>=0 && patientid>=0) {
					request.getServletContext().setAttribute("pid", patientid);
					
					doGet(request, response);
					
				}
			}
			else {
				request.setAttribute("msg", "Specified ID is invalid");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
		
		
	}

}
