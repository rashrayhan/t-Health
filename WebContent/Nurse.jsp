<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
if(session.getAttribute("username")==null || session.getAttribute("password")==null)  {
	
	response.sendRedirect("index.jsp");
	
}

%>
<% 

String[] data=request.getParameterValues("test");
pageContext.setAttribute("data", data);
if (data != null) {
for(String x:data){
	
	out.println("<p>"+ x +"</p>");
}}
%>
<c:forEach var="checkbox" items="${data}">

<p> this is the same as the for loops above:${checkbox} </p>
</c:forEach>
<%= request.getParameter("email") %> 

  <p>${param.name} is from ${param.country} and loves ${param.language}</p>
<iframe width="560" height="315" src="https://www.youtube.com/embed/ZUOXATeWkS0" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<form class="form-inline" method="get" action="logout">
        <div class="md-form my-0" >
               <a href="myformaction.jsp" class="form-control" >About us</a>
                        
            <button type="submit" class="btn btn-light">logout</button>
        </div>
        
      </form>  
      
      <div>
       <form class="form-inline" action="GetUser" method="get">
        <div class="md-form my-0" >
               <input type="text" name="uname" class="form-control" id="exampleInputUrl1" aria-describedby="emailHelp" value="0" >
                        
            <button type="submit" class="btn btn-light">Search</button>
        </div>
      </form>
       <form class="form-inline" action="GetUser" method="post">
        <div class="md-form my-0" >
               <input type="text" name="uname1" class="form-control" id="exampleInputUrl1" aria-describedby="emailHelp" value="0" >
               <input type="text" name="pwd1" class="form-control" id="exampleInputUrl1" aria-describedby="emailHelp" value="0" >
                        
            <button type="submit" class="btn btn-light">insert</button>
        </div>
      </form>
      
      </div>
</body>
</html>