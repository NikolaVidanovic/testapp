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
<table>
					<thead>
						<tr>
							<th>PIB</th>
							<th>MATICNI BROJ</th>
							<th>ADRESA</th>
							<th>MESTO</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="proizvodjac" items="${listaProizvodjaca}">
							<tr>
								<th>${proizvodjac.pib}</th>
								<th>${proizvodjac.maticniBroj}</th>
								<th>${proizvodjac.adresa}</th>
								<th>${proizvodjac.mesto.naziv}</th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
				<c:url value="/application/home" var="home"/>
		<a href="${home}">Nazad na CRUD menu.</a>
</body>
</html>