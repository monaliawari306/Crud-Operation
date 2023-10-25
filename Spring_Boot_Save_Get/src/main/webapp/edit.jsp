<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<pre>
<input type="hidden" name=id value="${e.id }">
Name:-<input type="text" name="name" value="${e.name }">
Address:-<input type="text" name="addr" value="${e.addr }">
State:-<input type="text" name="state" value="${e.state }">

<input type="submit" value="update">
</pre> 


</form>
</body>
</html>