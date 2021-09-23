<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form action="addalien" method="post">
 <input type="text" name="aid">
 <input type="text" name="aname">
 <input type="submit">
 </form>
 <hr>
 
 <form action="getalien" method="get">
 <input type="text" name="aid">
 <input type="submit">
 </form>
 
</body>
</html>