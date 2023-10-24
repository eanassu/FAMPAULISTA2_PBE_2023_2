<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.vemprafam.pojo.Funcionario"%>
<%@page import="br.com.vemprafam.dao.DaoFuncionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alteração de Dados</title>
</head>
<body>
<%
int re = Integer.parseInt(request.getParameter("re"));
DaoFuncionario dao = new DaoFuncionario();
Funcionario f = dao.buscarPeloRe(re);
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
String dataNascimento=dateFormat.format(f.getDataNascimento());
%>
<form action='alterarFuncionario'>
RE:<input type='text' name='re' value="<%=f.getRe()%>"/><br/>
nome:<input type='text' name='nome' value="<%=f.getNome()%>"/><br/>
e-mail:<input type='text' name='email' value="<%=f.getEmail()%>"/><br/>
data de nascimento:
<input type='text' name='dataNascimento' value="<%=dataNascimento%>"/><br/>
salário:<input type='text' name='salario' value="<%=f.getSalario()%>"/><br/>
<input type='submit' value='enviar'/><br/>
</form><br/>
<a href='/Projeto'>voltar</a>

</body>
</html>