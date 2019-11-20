<%@ page language="java" contentType="text/html; text/css; text/javascript; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta http-equiv="x-ua-compatible" content="ie=edge">
	<title>t-Health MUM</title>
	<!-- Font Awesome -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
	<!-- MDB icon
	<link rel="icon" href="img/mdb-favicon.ico" type="image/x-icon"> -->
	<!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<!-- Material Design Bootstrap -->
	<link rel="stylesheet" href="./css/mdb.min.css">
	<link  rel="stylesheet" type="text/css" href="./css/style.css">


</head>
<body>
	<section id="index-section" class="container col-12">
		<div class="index-left text-center">
			<img src="./images/doctor.png"/>
		</div>
		<!-- Default form login -->
		<form class="container shadow mt-3 mb-3 bg-white rounded border border-light p-5" method="post" action="LoginServlet">
			<p class="h2 mb-2 text-center">t-Health Sign in</p>
			<p class="p-underline"></p>
			
			<!-- Email -->
			<div class="md-form">
				<i class="fa fa-user blue-grey-text prefix"></i>
				<input type="text" name="username"  id="form2" class="form-control">
				<label for="form2">Your User Name</label>
			</div>

		    <div class="md-form">
				<i class="fa fa-lock blue-grey-text prefix"></i>
				<input type="password" name="password" id="form4" class="form-control">
				<label for="form4">Your password</label>
			</div>
	
		    <div class="d-flex justify-content-around">
		        <div>
		            <!-- Remember me -->
		            <div class="custom-control custom-checkbox">
		                <input type="checkbox" class="custom-control-input" id="defaultLoginFormRemember">
		                <label class="custom-control-label" for="defaultLoginFormRemember">Remember me</label>
		            </div>
		        </div>
		        <div>
		            <!-- Forgot password -->
		            <a href="">Forgot password?</a>
		        </div>
		    </div>
		    <br>
			<p class="text-danger">${msg}</p>
		    <!-- Sign in button -->
		    <button class="btn btn-block btn-deep-purple my-4 mt-5" type="submit">Sign in</button>
			
			<div class="text-center mt-5">
				
				<!-- Social login -->
				<p>Follow us on:</p>
			
				<a href="#" class="mx-2" role="button"><i class="fab fa-facebook-f light-blue-text"></i></a>
				<a href="#" class="mx-2" role="button"><i class="fab fa-twitter light-blue-text"></i></a>
				<a href="#" class="mx-2" role="button"><i class="fab fa-linkedin-in light-blue-text"></i></a>
				<a href="#" class="mx-2" role="button"><i class="fab fa-github light-blue-text"></i></a>
			
			</div>
		</form>
		<!-- Default form login -->	
	
		
	</section>
	
	
	<!-- jQuery -->
	<script type="text/javascript" src="./js/jquery.min.js"></script>
	<!-- Bootstrap tooltips -->
	<script type="text/javascript" src="./js/popper.min.js"></script>
	<!-- Bootstrap core JavaScript -->
	<script type="text/javascript" src="./js/bootstrap.min.js"></script>
	<!-- MDB core JavaScript -->
	<script type="text/javascript" src="./js/mdb.min.js"></script>
	<!-- Your custom scripts (optional) -->
	<script type="text/javascript"></script>

</body>
</html>
