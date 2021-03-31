<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>Spring Security Example</title>
    </head>
    <body>
       <h3>Spring Security Example</h3>
        <font color="red">
		   ${SPRING_SECURITY_LAST_EXCEPTION.message}
        </font>
	<form:form action="${pageContext.request.contextPath}/appLogin" method="POST">
		Enter UserName:	<input type="text" name="app_username"/><br/><br/>
		Enter Password: <input type="password" name="app_password"/> <br/><br/>		
		<input type='checkbox' name="remember-me-param"/>Remember Me? <br/>	
		<input type="submit" value="Login"/>
	</form:form>
    <body>
</html>   