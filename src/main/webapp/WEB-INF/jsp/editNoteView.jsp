<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="../layout/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Edit Note</title>
</head>
<body>

<a href="/getNotes"><button type="button" class="btn btn-secondary"  style="margin:5px;" >Back to Note List</button> </a>
<div class="container"  >
<div class="row">
		<div class="col-12" > 
		<form:form method="POST" action="/editNote" modelAttribute="note">
		
		
		<div class="form-group"> 
		<p class="font-weight-bold"><label for="id">ID :</label></p>
		<input class="form-control" name="id" type="text" value="${note.id}" readonly >
		</div><br>
		
		<div class="form-group">
		<p class="font-weight-bold"><label for="title">TITLE :</label></p>
	    <input class="form-control" name="title" type="text" value="${note.title}"  >
		</div><br>
		
		<div class="form-group"> 
		<p class="font-weight-bold"><label for="content">CONTENT :</label></p>
		<textarea class="form-control" name="content" rows="5" >${note.content} </textarea>
		</div><br>
		
		<div class="form-group">
		<p class="font-weight-bold"><label for="modifiedDate">MODIFIED DATE :</label></p>
		<input class="form-control" name="modifiedDate" type="text" value="${note.modifiedDate}" readonly >
		</div>
		
		<div class="form-group">
 			 <input type="submit" value="Edit" class="btn btn-primary " />
 			 </div>
		</form:form>
		</div>
</div>
</body>
</html>