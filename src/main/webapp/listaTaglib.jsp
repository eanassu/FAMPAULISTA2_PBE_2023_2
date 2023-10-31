<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista (taglib)</title>
</head>
<body>
<table border="1">
<tr>
	<th>RE</th>
	<th>nome</th>
	<th>e-mail</th>
	<th>data de nascimento</th>
	<th>salário</th>
</tr>
<c:forEach var="f" items="${funcionarios}">
<tr>
<td>${f.re}</td>
<td>${f.nome}</td>
<td>${f.email}</td>
<td><fmt:formatDate value="${f.dataNascimento}" pattern="dd/MM/yyyy"/></td>
<td><fmt:formatNumber value="${f.salario}" type="currency"/></td>
</tr>
</c:forEach>
</table>
<a href="/Projeto">voltar</a>
</body>
</html>