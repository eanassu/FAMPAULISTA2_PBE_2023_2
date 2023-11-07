<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.vemprafam.pojo.Funcionario"%>
<%@page import="br.com.vemprafam.dao.DaoFuncionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alteração de Dados</title>
</head>
<body>
<form action='controller'>
RE:<input type='text' name='re' value="${f.re}"/><br/>
nome:<input type='text' name='nome' value="${f.nome}"/><br/>
e-mail:<input type='text' name='email' value="${f.email}"/><br/>
data de nascimento:
<input type='text' name='dataNascimento' value='<fmt:formatDate value="${f.dataNascimento}" pattern="dd/MM/yyyy"/>'/><br/>
salário:<input type='text' name='salario' value="${f.salario}"/><br/>
<input type="hidden" name="op" value="Alteracao"/>
<input type='submit' value='enviar'/><br/>
</form><br/>
<a href='/Projeto'>voltar</a>

</body>
</html>