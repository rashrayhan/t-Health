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
         <!-- Nav tabs -->
        <ul class="nav nav-tabs patient-navs-custom" role="tablist">
                <li class="nav-item text-center">
                    <a class="nav-link active" data-toggle="tab" href="#panel1" role="tab"><i class="fa fa-file-medical-alt fa-2x"></i><br> Personal Data</a>
                </li>
                <li class="nav-item text-center">
                    <a class="nav-link" data-toggle="tab" href="#panel2" role="tab"><i class="fa fa-clipboard fa-2x text-center"></i><br>Medical Record</a>
                </li>
                <li class="nav-item text-center">
                    <a class="nav-link" data-toggle="tab" href="#panel3" role="tab"><i class="fa fa-stethoscope fa-2x"></i><br> Diagnosis</a>
                </li>
                <li class="nav-item text-center">
                    <a class="nav-link" data-toggle="tab" href="#panel4" role="tab"><i class="fa fa-prescription fa-2x"></i><br> Prescription</a>
                </li>
                <li class="nav-item text-center">
                    <a class="nav-link" data-toggle="tab" href="#panel5" role="tab"><i class="fa fa-notes-medical fa-2x"></i><br> Sick Leave</a>
                </li>
            </ul>
            <!-- Tab panels -->
    
            <div class="tab-content card">
           
                <!--Panel 1-->
                <div class="tab-pane fade in show active p-4" id="panel1" role="tabpanel">
                    <!--Avatar-->
                    <div class="avatar text-center patient-avatar">
                        <img src="./images/parallel-avatar.jpg" class="rounded-circle img-responsive">
                        <p class="h5 text-muted mt-2">#ID: <c:out value="${patientdata.studentId}"></c:out></p> 
                      <!-- get the patient record id set by petient infor servlet -->
                        <input type="hidden" name="patient_record_id" value="${pid} }"/>
                    </div>
                    <div class="patient-info mt-3">
                        <table class="table">
                            <thead class="blue lighten-5 text-center">
                                <tr>
                                    <th colspan="2" class="h5">Patient Personal Information</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td scope="row" class="text-right font-weight-normal text-info lead">Name: </td>
                                    <td class="lead text-capitalize">${patientdata.firstName} ${patientdata.lastName}</td>
                                </tr>

                                <tr>
                                    <td scope="row" class="text-right font-weight-normal text-info lead">Gender: </td>
                                    <td class="lead text-capitalize">${patientdata.gender}</td>
                                </tr>

                                <tr>
                                    <td scope="row" class="text-right font-weight-normal text-info lead">Date of Birth: </td>
                                    <td class="lead ">${patientdata.dob}</td>
                                </tr>

                                <tr>
                                    <td scope="row" class="text-right font-weight-normal text-info lead">Phone #: </td>
                                    <td class="lead ">${patientdata.phone}</td>
                                </tr>

                                <tr>
                                    <td scope="row" class="text-right font-weight-normal text-info lead">Email: </td>
                                    <td class="lead ">${patientdata.email}</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                
                </div>
                
                <div class="tab-pane fade in show p-4" id="panel2" role="tabpane2">
                        <p class="h6 mb-2 text-center">Last Visit Date: 11-20-2019</p>
                        <p class="p-underline"></p>
                    <form class="row shadow m-1 bg-white rounded p-5 col-12" action="InsertVitalInfoServlet" method="POST">

                        <div class="col-6">
                            <div class="md-form">
                                <i class="fa fa-weight blue-grey-text prefix"></i>
                                <input type="text" name="weight" id="weight" value="${vitalinfo.weight}" class="form-control">
                                <label for="weight">Weight</label>
                            </div>
                
                            <div class="md-form">
                                <i class="fa fa-ruler-vertical blue-grey-text prefix"></i>
                                <input type="text" name="height" id="height" class="form-control">
                                <label for="height">Height</label>
                            </div>
                            <div class="md-form">
                                <i class="fa fa-thermometer-three-quarters blue-grey-text prefix"></i>
                                <input type="text" name="temperature" id="temperature" class="form-control">
                                <label for="temperature">Temperature</label>
                            </div>
                        </div>
                        <div class="col-6">
                            <div class="md-form">
                                <i class="fa fa-heartbeat blue-grey-text prefix"></i>
                                <input type="text" name="heart-rate" id="heart-rate" class="form-control">
                                <label for="heart-rate">Heart Rate</label>
                            </div>
                
                            <div class="md-form">
                                <i class="fa fa-air-freshener blue-grey-text prefix"></i>
                                <input type="text" name="oxygen" id="oxygen" class="form-control">
                                <label for="oxygen">Oxygen Level</label>
                            </div>
                            <div class="md-form">
                                <i class="fa fa-tint blue-grey-text prefix"></i>
                                <input type="text" name="blood" id="blood" class="form-control" value="">
                                <label for="blood">Blood Pressure</label>
                            </div>
                        </div>
                        <div class="text-center col-12">
                            <button class="btn btn-indigo waves-effect waves-light mt-5" type="submit">Save</button>
                        </div>
                        
                    </form>
                </div>

                <div class="tab-pane fade in show p-4" id="panel3" role="tabpane3">
                        
                    <form class="row shadow m-1 bg-white rounded p-5 col-12" action="DiagnoseServlet" method="POST">

                        <div class="col-6">
                            <div class="md-form">
                                <i class="fas fa-diagnoses prefix"></i>
                                <textarea name="symptoms" id="symptoms" class="md-textarea form-control" rows="4"></textarea>
                                <label for="symptoms">Symptoms</label>
                            </div>
                
                            <div class="md-form">
                                <i class="fas fa-tablets prefix"></i>
                                <textarea name="medication" id="medication" class="md-textarea form-control" rows="4"></textarea>
                                <label for="medication">Current Medication</label>
                            </div>
                        </div>
                        <div class="col-6">
                            <div class="md-form">
                                <i class="fas fa-file-medical prefix"></i>
                                <textarea name="findings" id="findings" class="md-textarea form-control" rows="4"></textarea>
                                <label for="findings">Findings</label>
                            </div>
                
                            <div class="md-form">
                               <i class="fas fa-comment-medical prefix"></i>
                                <textarea name="treatment" id="treatment" class="md-textarea form-control" rows="4"></textarea>
                                <label for="treatment">Treatment</label>
                            </div>
                        </div>
                        
                        <div class="text-center col-12">
                                <button class="btn btn-indigo waves-effect waves-light mt-5" type="submit">Save</button>
                        </div>
                        
                        
                    </form>
                </div>

                <div class="tab-pane fade in show p-4" id="panel4" role="tabpane4">
                    <form class="row shadow m-1 bg-white rounded p-5 col-12" action="#!" method="POST">
                        <div class="col-12 mb-4">
                            <div class="input-group flex-nowrap">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="addon-wrapping">
                                            <i class="fas fa-capsules"></i>
                                    </span>
                                </div>
                                <input type="text" class="form-control p-4" name="medicine" placeholder="Medicine name" aria-label="medicine" aria-describedby="addon-wrapping">
                            </div>
                        </div>

                        <div class="col-6">
                            <select class="mt-3 browser-default custom-select">
                                <option>Direction of usage</option>
                                <option value="1ce daily">1ce daily</option>
                                <option value="2ce daily">2ce daily</option>
                                <option value="3ce daily">3ce daily</option>
                                <option value="Every other day">Every other day</option>
                            </select>
                
                            <div class="input-group mt-3 mb-3">
                                <div class="input-group-prepend">
                                <span class="input-group-text" id="pills">Pills (count)</span>
                                </div>
                                <input type="number" class="form-control" name="pills" aria-label="pills" aria-describedby="pills">
                            </div>
                        </div>
                        
                        <div class="col-6">
                            <div class="input-group mt-3 mb-3">
                                <div class="input-group-prepend">
                                <span class="input-group-text" id="dosage_size">Dosage (size)</span>
                                </div>
                                <input type="text" class="form-control" name="dosage_size" aria-label="Dosage size" aria-describedby="dosage_size">
                            </div>
                            <div class="input-group mt-3 mb-3">
                                <div class="input-group-prepend">
                                <span class="input-group-text" id="dosage_qty">Dosage (qty)</span>
                                </div>
                                <input type="number" class="form-control" name="dosage_qty" aria-label="Dosage qty" aria-describedby="dosage_qty">
                            </div>
                            
                        </div>
                        
                        <div class="text-center col-12">
                            <button class="btn btn-indigo waves-effect waves-light mt-5" type="submit">Save</button>
                        </div>
                    </form>
                </div>

                <div class="tab-pane fade in show  p-4" id="panel5" role="tabpane5">
                        
                    <form class="row shadow m-1 bg-white rounded p-5 col-12" action="#!" method="POST">

                        <div class="col-6">
                            <div class="md-form">
                                <i class="fa fa-sticky-note blue-grey-text prefix"></i>
                                <input type="text" name="subject" id="subject" class="form-control">
                                <label for="subject">Subject</label>
                            </div>
                
                        </div>
                        <div class="col-12">
                            <div class="md-form">
                                <i class="fas fa-comment-medical prefix"></i>
                                <textarea name="message" id="message" class="md-textarea form-control" rows="6"></textarea>
                                <label for="message">Message</label>
                            </div>
                
                        </div>
                        
                        <div class="text-center col-12">
                            <button class="btn btn-indigo waves-effect waves-light mt-5" type="submit" onclick="print()">Print</button>
                        </div>
                        
                        
                    </form>
                </div>
            </div>
    
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
