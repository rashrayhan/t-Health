package com.thealth.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thealth.DAO.Auth.loginVerify;
import com.thealth.Model.Users;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name="LoginServlet", urlPatterns= {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	loginVerify login=new loginVerify();
	Users users=new Users();
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
		 HttpSession session;
		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		users.setUsername(uname);
		users.setPassword(password);
		String user=login.check(users);
		
		if(user.equals("Nurse")) {
			  session= request.getSession();
			 session.setAttribute("username", users.getUsername());
			 session.setAttribute("password", users.getPassword());
			 session.setAttribute("userid", login.getId());
			 response.sendRedirect("Nurse.jsp");
		}
		else if(user.equals("not a user")) {
			
			String msg="Incorrect user credentials, Try again";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
			
		}
		else {
			  	session= request.getSession();
				 session.setAttribute("username", users.getUsername());
				 session.setAttribute("password", users.getPassword());
				 response.sendRedirect("Patient.jsp");
		}
		
		System.out.println("do post executed");
	}

}
