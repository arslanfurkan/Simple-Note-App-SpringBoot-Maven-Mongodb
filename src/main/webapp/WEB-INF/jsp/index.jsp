<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="../layout/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Note App</title>
</head>
<body>
<div class="container" style="margin-top:10px;" >
<div class="row">
		<div class="col-12" >
		<div class="list-group">
		
		
  		<a href="#" class="list-group-item list-group-item-action disabled"><h1>Note App</h1></a>
	    <a href="/getNotes" class="list-group-item list-group-item-action"><button type="button" class="btn btn-info">List My Notes</button></a>
  		<a href="/newNote" class="list-group-item list-group-item-action "><button type="button" class="btn btn-success">Add a New Note</button></a>
		</div>
		</div>
		</div>
</div>
</body>
</html>