<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> All Books!</h1>
	<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
         <!-- loop over all the books to show the details as in the wireframe! -->
         <c:forEach items= "${allBooksMUNKIE }" var= "b" >
         <li>
         <c:out value="${b.id }" />
         	<a href="/books/${b.id }">   
				<c:out value="${b.title }" />
         	</a>
         		
				<c:out value="${b.language }" />
				<c:out value="${b.numberOfPages }" />
			</li>
		</c:forEach>
    </tbody>
</table>
</body>
</html>