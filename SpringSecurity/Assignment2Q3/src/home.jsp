<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Spring Security Example</title>
    </head>
    <body>
        <form:form action="${pageContext.request.contextPath}/appLogout" method="POST">
           <input type="submit" value="Logout"/>
        </form:form>   
        Welcome to you. Find secure data. <br/>
	<c:forEach var="ob" items="${list}">
	    <br/><c:out value="${ob.stdId}"></c:out>
	      <c:out value="${ob.stdName}"></c:out>	        
	</c:forEach>
    </body>
</html> 