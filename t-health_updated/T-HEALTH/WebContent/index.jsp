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
	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
	
	<link  rel="stylesheet" type="text/css" href="./css/style.css">
	<link  rel="stylesheet" type="text/css" href="./css/dribble.css">


</head>
<body>
	<section id="index-section" class="homepage-section container col-12">
		<div class="index-left text-center">
			<img src="./images/doctor.png"/>
		</div>
		<form class="container shadow bg-white rounded border border-light p-5" method="post" action="PatientSelfCheckinServlet">
			<p class="h2 mb-2 text-center">t-Health Check in</p>
			<p class="p-underline"></p>
			
			<div class="md-form">
				<i class="fa fa-user blue-grey-text prefix"></i>
				<input type="number" name="stid" id="stid" class="form-control">
				<label for="stid">Your ID e.e. 001122</label>
			</div>

		    <div class="md-form">
				<select name="symptoms" multiple data-placeholder="Please select symptoms">
					<option value="Headache">Headache</option>
					<option value="Cough">Cough</option>
					<option value="Diarrhea">Diarrhea</option>
					<option value="Fever">Fever</option>
					<option value="Fatigue">Fatigue</option>
					<option value="Bloating">Bloating</option>
					<option value="Dizziness">Dizziness</option>
					<option value="Muschle cramp">Muschle cramp</option>
					<option value="Nausea">Nausea</option>
					<option value="Throat irritation">Throat irritation</option>
				</select>
			</div>
			<br>
			<p class="text-danger text-center small">${msg}</p>
		    <button class="btn btn-block btn-deep-purple my-4 mt-4" type="submit">Join Queue</button>
			
			<div class="text-center mt-4 queue-list">
				<p class="h6 text-primary">Queue List</p>
				<table class="table table-hover">
					<!-- Table head -->
					<thead class="blue lighten-4">
						<tr>
						<th>#</th>
						<th>Patient ID</th>
						<th>Time</th>
						</tr>
					</thead>
					<!-- Table head -->
	
					<!-- Table body -->
					<tbody>
						<c:forEach var="patientdata" items="${queueData}" varStatus="iteration">

		 					<tr>
		 					<td><c:out value="${iteration.index+1}"></c:out></td>
		 				 	<td><c:out value="${patientdata.stid}"></c:out></td>
	                        <td><c:out value="${patientdata.time}"></c:out></td>
	                       
					       </tr>
					</c:forEach>
					</tbody>
					<!-- Table body -->
				</table>
				
			</div>
		</form>
		
	</section>
	
	
	<script type="text/javascript" src="./js/jquery.min.js"></script>
	<script type="text/javascript" src="./js/popper.min.js"></script>
	<script type="text/javascript" src="./js/bootstrap.min.js"></script>
	<script type="text/javascript" src="./js/mdb.min.js"></script>
	<script type="text/javascript" src="./js/dribble.js"></script>
	<script type="text/javascript"></script>
	

</body>
</html>
