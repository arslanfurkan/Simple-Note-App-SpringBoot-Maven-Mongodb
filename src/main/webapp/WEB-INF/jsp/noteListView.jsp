<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="../layout/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>My Notes</title>
</head>
<body>
<a href="/#"><button type="button" class="btn btn-secondary" style="margin:5px;">Back to Menu</button> </a>
<div class="container" >
<div class="row">
		<div class="col-12" >
		
		<c:choose>
    <c:when test="${notes.size() == 0}">
         <div class='alert alert-danger' role='alert'>No notes founded. Would you like to add  one?</div>
         <a href="/newNote"><button type="button" class="btn btn-success btn-lg">Add a new Note</button></a>
    </c:when>
    <c:otherwise>
      <table class="table table-hover table-bordered">
		<thead>
		<tr>
					<th scope="col">ID</th>
					<th scope="col">TITLE</th>
					<th scope="col">MODIFIED DATE</th>
					<th scope="col">SEE CONTENT</th>
					<th scope="col">EDIT NOTE</th>
					<th scope="col">DELETE NOTE</th>
				
		</tr>
		</thead>
		<c:forEach items="${notes}" var="note">
		<tr>
					<td scope="row">${note.id}</td>
					<td scope="row">${note.title}</td>
					<td scope="row">${note.modifiedDate} </td>
					<td scope="row"> <a href="/getNote?id=${note.id}"><button type="button" class="btn btn-success btn-sm">See Content</button></a> </td>
					<td scope="row"> <a href="/editNote?id=${note.id}"><button type="button" class="btn btn-primary btn-sm">Edit Note</button></a></td>
					<td scope="row"> <a href="/deleteNote?id=${note.id}"><button type="button" class="btn btn-danger btn-sm">Delete Note</button></a></td>	
		</tr>
		</c:forEach>
		</table>
    </c:otherwise>
</c:choose>
		
		
		</div>
		</div>
</div>




</body>
</html>