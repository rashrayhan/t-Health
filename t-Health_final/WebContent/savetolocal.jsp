<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>save to local</title>
</head>
<body>

<div class="container">
	 <div class="form-group">
                <label for="exampleInputEmail1">*Student Id</label>
                <input type="hidden" class="form-control" id="stid" name="stid"  aria-describedby="emailHelp" value="${stid}" >
              
              </div>
              <div class="form-group">
                <label for="exampleInputEmail1">*Date</label>
                <input type="hidden" class="form-control" id="date" name="date"  aria-describedby="emailHelp" value="${symptom}" >
              
              </div>
               <div class="form-group">
                <textarea style="display:none;" id="symptom"
                class="form-control md-textarea" rows="3" name="symptom">${date}</textarea>
              <label for="materialContactFormMessage">*Symptom</label>
               </div>
</div>

<script type="text/javascript" src="../js/savetolocal.js"></script>
</body>
</html>