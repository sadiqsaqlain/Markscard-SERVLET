<%@page import="Dto.Students"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updatemarks">
<%Students s=(Students) request.getAttribute("stud");%>

usn:	<input type="text" name="usn" value="<%=s.getUsn()%>" readonly="readonly"><br>
name:	<input type="text" name="name" value="<%=s.getName()%>" readonly="readonly"><br>
Maths:		<input type="number" name="maths" value="<%=s.getMaths()%>"><br>
Science:		<input type="number" name="science" value="<%=s.getScience()%>"><br>
Hindi:		<input type="number" name="hindi" value="<%=s.getHindi()%>"><br>
Kannada:		<input type="number" name="kannada" value="<%=s.getKannada()%>"><br>
Social:		<input type="number" name="social" value="<%=s.getSocial()%>"><br>
Physics:		<input type="number" name="physics" value="<%=s.getPhysics()%>"><br>

	<button type="submit">submit</button>
</form>
</body>
</html>