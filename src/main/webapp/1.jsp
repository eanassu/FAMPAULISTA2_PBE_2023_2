<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Primeira p�gina JSP</title>
</head>
<body>
<%
  String mensagem = "Hello World!";
%>
<%-- coment�rio JSP --%>
<h1>Teste JSP</h1>
<% out.println(mensagem);
System.out.println("Isto vai no servidor");
%><br/>
<%=mensagem %>
</body>
</html>

