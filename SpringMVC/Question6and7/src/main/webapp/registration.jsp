<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>  
.error{color:red}  
</style> 
</head>
<body>
<form:form action="result" modelAttribute="cus">  
Username  : <form:input path="username" /><form:errors path="username" cssClass="error"/><br><br> 
Password  : <form:input path="password" /><form:errors path="password" cssClass="error"/><br><br>  
Email     :   <form:input path="email" /><form:errors path="email" cssClass="error"/><br><br>
Contact   :   <form:input path="contact" /><form:errors path="contact" cssClass="error"/><br><br>
City      : <form:select path="city">  
        <form:option value="Pune" label="Pune"/>  
        <form:option value="Mumbai" label="Mumbai"/>  
        <form:option value="Delhi" label="Delhi"/>  
        <form:option value="Amristar" label="Amristar"/>  
        </form:select><form:errors path="city" cssClass="error"/><br><br>  
Zipcode  :   <form:input path="zipcode" /><form:errors path="zipcode" cssClass="error"/><br><br>     
        <input type="submit" value="Submit" />  
    </form:form>  
</body>
</html>