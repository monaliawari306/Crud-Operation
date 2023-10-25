<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>ID</th>
<th>Name</th>
<th>Address</th>
<th>State</th>
<th>Action</th>
</tr>
<c:forEach items="${l}" var="e">

<tr>
<td><input type ="radio" name= "id" value = "${e.id}"></td>
<td>${e.name}</td>
<td>${e.addr}</td>
<td>${e.state}</td>
<td><a href="delete?id=${e.id}">DELETE</a>||<a href="edit?id=${e.id}">EDIT</a></td>
</tr>

</c:forEach>

</table>
</body>
</html>