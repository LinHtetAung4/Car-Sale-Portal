<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Contact Form</h1>

<h3>${success}</h3>
	
	<form:form method="POST" action="/contact" modelAttribute="contact">
		<table>
			<tr>
			<td> <form:hidden path="id"/> </td>
				<td><form:label path="email" >Email</form:label></td>
				<td><form:input path="email" value="" /></td>
			</tr>
			
			
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>