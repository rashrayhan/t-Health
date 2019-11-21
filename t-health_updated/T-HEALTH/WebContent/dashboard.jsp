<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta http-equiv="x-ua-compatible" content="ie=edge">
	<title>t-Health MUM</title>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<link rel="stylesheet" href="./css/mdb.min.css">
    <link  rel="stylesheet" type="text/css" href="./css/style.css">
    <link  rel="stylesheet" type="text/css" href="./css/style.min.css">
    

</head>
<body class="grey lighten-3">
<% 
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
if(session.getAttribute("username")==null || session.getAttribute("password")==null)  {
	
	response.sendRedirect("admin.jsp");
	
}

%>
    
    <header>

    <!-- Navbar -->
    <nav class="navbar fixed-top navbar-expand-lg navbar-light white scrolling-navbar">
        <div class="container-fluid">

        <!-- Brand -->
        <a class="navbar-brand waves-effect" href="">
            <strong class="blue-text">Welcome to t-Health</strong>
        </a>

        <!-- Collapse -->
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
            <!-- Right -->
            <ul class="navbar-nav nav-flex-icons">
            <li class="nav-item">
                <a href="logout" class="nav-link border border-light rounded waves-effect">
                <i class="fas fa-sign-out-alt mr-2 blue-text"></i>Logout
                </a>
            </li>
            </ul>
        </div>
    </nav>
    <!-- Navbar -->

    <!-- Sidebar -->
    <div id="navbarSupportedContent" class="sidebar-fixed position-fixed">

        <a class="waves-effect">
        <img src="./images/logo.PNG" class="img-fluid" alt="">
        </a>

        <div class="list-group list-group-flush mt-5">
        <a href="NurseCheckinServlet" class="list-group-item waves-effect">
            <i class="fas fa-users mr-3"></i>Dashboard
        </a>
        <a href="#" class="list-group-item list-group-item-action waves-effect">
                <i class="fas fa-chart-bar mr-3"></i>Statistics</a>
        <a href="#" class="list-group-item list-group-item-action waves-effect">
            <i class="fas fa-user-cog mr-3"></i>Profile</a>
        </div>

    </div>
    <!-- Sidebar -->

    </header>
    
  <main class="pt-5 mx-lg-5">
        <div class="container-fluid mt-5">
            <div class="d-flex justify-content-center">
            <div class="card mb-5 wow fadeIn col-8">
                <div class="card-body d-sm-flex text-center">
                    <form class="form col-12 p-5" action="PatientInfoServlet" method="post">
                        <input class="form-control mr-sm-2 p-4" type="text" name="p-id" placeholder="Enter patient id: e.g. 666555" aria-label="Patient id">
                        <button class="btn btn-block blue-gradient btn-rounded mt-3 p-3" type="submit">Retrieve File</button>
                    </form>
                </div>
            </div>
        </div>
         
          <!-- Heading -->
    
          <!--Grid row-->
          <div class="row wow fadeIn">
            <!--Grid column-->
            <div class="col-md-8 mb-4">
    
              <!--Card-->
              <div class="card">
                    <div class="card-header text-center">Patient(s) on Queue</div>
                <!--Card content-->
                <div class="card-body">
    
                  <!-- Table  -->
                  <table class="table table-hover">
                    <!-- Table head -->
                    <thead class="blue lighten-4">
                      <tr>
                        <th>#</th>
                        <th>Patient ID</th>
                        <th>Symptoms</th>
                        <th>Time</th>
                      </tr>
                    </thead>
                    <!-- Table head -->
    
                    <!-- Table body -->
                    <tbody>
                     
                     <c:forEach var="patientdata" items="${queueData}" varStatus="iteration">

		 					<tr>
		 					<td><c:out value="${iteration.index+1}"></c:out></td>
		 					<c:set var="p-id" scope="application" value="${patientdata.stid}"/>
		 					
		 				 	<td><a href="PatientInfoServlet" class="text-primary font-weight-normal"><c:out value="${patientdata.stid}"></c:out></a></td>
		 				 	 <td><c:out value="${patientdata.symptoms}"></c:out></td>
	                        <td><c:out value="${patientdata.time}"></c:out></td>
	                       
					       </tr>
					</c:forEach>
                     
                    </tbody>
                    <!-- Table body -->
                  </table>
                  <!-- Table  -->
    
                </div>
    
              </div>
              <!--/.Card-->
    
            </div>
            <!--Grid column-->
            
            
            <!--Grid column-->
            <div class="col-md-4 mb-4">
    
                    <!--Card-->
                    <div class="card">
                      <div class="card-header text-center">Recent Patients</div>
                      <!--Card content-->
                      <div class="card-body">
          
                        <!-- Table  -->
                        <table class="table table-hover">
                          <!-- Table head -->
                          <thead class="blue-grey lighten-4">
                                <tr>
                                  <th>#</th>
                                  <th>Patient ID</th>
                                  <th>Time</th>
                                </tr>
                              </thead>
                              <!-- Table head -->
              
                              <!-- Table body -->
                              <tbody>
                                <tr>
                                  <th scope="row">1</th>
                                  <td><a href="#" class="text-primary font-weight-normal">012989</a></td>
                                  <td>13:05</td>
                                </tr>
                                
                              </tbody>
                        </table>
                        <!-- Table  -->
          
                      </div>
          
                    </div>
                    <!--/.Card-->
          
                  </div>
                  <!--Grid column-->
          
          </div>
          <!--Grid row-->
    
        </div>
      </main>
      <!--Main layout-->

      
    <!--Footer-->
    <footer class="page-footer text-center primary-color-dark darken-2 mt-4 wow fadeIn">
        <!--Copyright-->
        <div class="footer-copyright py-3">
        © 2019 Copyright: <a href="#" target="_blank"> WAP472 Final Project </a>
        </div>
        <!--/.Copyright-->
        
    </footer>
    <!--/.Footer-->
            
	<script type="text/javascript" src="./js/jquery.min.js"></script>
	<script type="text/javascript" src="./js/popper.min.js"></script>
	<script type="text/javascript" src="./js/bootstrap.min.js"></script>
	<script type="text/javascript" src="./js/mdb.min.js"></script>
	<script type="text/javascript"></script>

</body>
</html>
