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


</head>
<body>
<% 
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
if(session.getAttribute("username")!=null || session.getAttribute("password")!=null)  {
	
	response.sendRedirect("NurseCheckinServlet");
	
}
%>



	<section id="" class="homepage-section container col-12">
		<div class="index-left text-center">
			<img src="./images/doctor.png"/>
		</div>
		<form class="container shadow mt-3 mb-3 bg-white rounded border border-light p-5" action="LoginServlet">
			<p class="h2 mb-2 text-center">t-Health Sign in</p>
			<p class="p-underline"></p>
			
			<div class="md-form">
				<i class="fa fa-user blue-grey-text prefix"></i>
				<input type="text" name="username" id="form2" class="form-control">
				<label for="form2">Your User name</label>
			</div>

		    <div class="md-form">
				<i class="fa fa-lock blue-grey-text prefix"></i>
				<input type="password" name="password" id="form4" class="form-control">
				<label for="form4">Your password</label>
			</div>
	
		    <div class="d-flex justify-content-around">
		        <div>
		            <div class="custom-control custom-checkbox">
		                <input type="checkbox" class="custom-control-input" id="defaultLoginFormRemember">
		                <label class="custom-control-label" for="defaultLoginFormRemember">Remember me</label>
		            </div>
		        </div>
		        <div>
		            <a href="#">Forgot password?</a>
		        </div>
		    </div>
			<br>
			<p class="text-danger text-center small">${msg}</p>
		    <button class="btn btn-block btn-deep-purple my-4 mt-5" type="submit">Sign in</button>
			
			<div class="text-center mt-5">
				
				<p>Follow us on:</p>
			
				<a href="#" class="mx-2" role="button"><i class="fab fa-facebook-f light-blue-text"></i></a>
				<a href="#" class="mx-2" role="button"><i class="fab fa-twitter light-blue-text"></i></a>
				<a href="#" class="mx-2" role="button"><i class="fab fa-linkedin-in light-blue-text"></i></a>
				<a href="#" class="mx-2" role="button"><i class="fab fa-github light-blue-text"></i></a>
			
			</div>
		</form>
		
	</section>
	
	
	<script type="text/javascript" src="./js/jquery.min.js"></script>
	<script type="text/javascript" src="./js/popper.min.js"></script>
	<script type="text/javascript" src="./js/bootstrap.min.js"></script>
	<script type="text/javascript" src="./js/mdb.min.js"></script>
	<script type="text/javascript"></script>

</body>
</html>
