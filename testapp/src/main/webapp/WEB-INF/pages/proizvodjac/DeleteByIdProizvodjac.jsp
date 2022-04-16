<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/fragments/loggedUser.jsp" flush="true"/>
<br>
<h2>Uspesno obrisan proizvodjac.</h2>


<c:url value="/application/home" var="home"/>
		<a href="${home}">Nazad na CRUD menu.</a>
		
</body>
</html>