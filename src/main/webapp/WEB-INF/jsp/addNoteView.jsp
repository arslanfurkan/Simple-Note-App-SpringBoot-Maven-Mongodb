<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="../layout/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Add Note</title>
</head>
<body>

<a href="/#"><button type="button" class="btn btn-secondary"  style="margin:5px;" >Back to Menu</button> </a>
<div class="container"  >
<div class="row">
		<div class="col-12" >
			<form:form method="POST" action="/addNote" modelAttribute="note">
			
			
			<div class="form-group">
    		<form:label path="title">Title :</form:label>
   			<form:input path="title" cssClass="form-control"/>
  			</div>
  			
			<div class="form-group">
    		<form:label path="content">Content : </form:label>
			<form:textarea path="content" cssClass="form-control"  rows="5"></form:textarea >	 
 			 </div>
 			 
 			 <div class="form-group">
 			 <input type="submit" value="Submit" class="btn btn-success" />
 			 </div>
			</form:form>
		
			</div>
		</div>
</div>
</body>
</html>