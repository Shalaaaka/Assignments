<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px" cellpadding="8px">
<tr>
<td>Name</td><td>Salary</td>
</tr>
<c:forEach items="${empdata}" var="current">
<tr>
   <td><c:out value="${current.key}" /></td>
   <td><c:out value="${current.value}" /></td>
</tr>
</c:forEach>
</table>
</body>
</html>