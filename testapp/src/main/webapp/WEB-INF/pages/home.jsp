<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	
	<jsp:include page="/WEB-INF/fragments/loggedUser.jsp" flush="true"/>
	
	<br>
	<br>
	<div>
		<form action="/testapp/application/proizvodjac/findAll" method="GET">
		<input type="submit" value="FindAll"/>
		</form>
		<br>
		<%-- <c:url value="/application/proizvodjac/findAll" var="findAll"/>
		<a href="${findAll}">FindAll</a>--%>
		<form action="/testapp/application/proizvodjac/findById" method="GET">
		<input type="text" placeholder="id" name="findByIdValue"/>
		<input type="submit" value="FindById"/>
		</form>
		<br>
		<form action="/testapp/application/proizvodjac/create" method="GET">
		<input type="text" placeholder="pib" name="pib"/>
		<input type="text" placeholder="maticniBroj" name="maticniBroj"/>
		<input type="text" placeholder="adresa" name="adresa"/>
		<input type="text" placeholder=pttBroj name="pttBroj"/>
		<input type="submit" value="SaveOrUpdate"/>
		</form>
		<br>
		<form action="/testapp/application/proizvodjac/delete" method="GET">
		<input type="text" name="proizvodjacId" placeholder="id" />
		<input type="submit" value="Delete"/>
		</form>
		${deleteByIdError}
	</div>
	
</body>
</html>
