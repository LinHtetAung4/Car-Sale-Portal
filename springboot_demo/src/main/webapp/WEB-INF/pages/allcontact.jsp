<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>All contact list page</h1>

<a href="/contact">Add new contact</a>

<table border=1 >

<tr>
<th>No.</th>
<th>Email</th>
<th colspan=2>Action</th>

</tr>
<% int i=1; %>
<c:forEach var="contact" items="${listcontact}">

<tr>
<td><%=i++ %></td>
<td>${contact.email} </td>
<td><a href="updateontact/${contact.id}">Update</a></td>
<td><a href="delcontact/${contact.id}">Delete</a></td>


</tr>

</c:forEach>


</table>
</body>
</html>