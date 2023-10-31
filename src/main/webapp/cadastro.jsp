<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action='controller'>
RE:<input type='text' name='re'/><br/>
nome:<input type='text' name='nome'/><br/>
e-mail:<input type='text' name='email'/><br/>
data de nascimento:
<input type='text' name='dataNascimento'/><br/>
salário:<input type='text' name='salario'/><br/>
<input type="hidden" name="op" value="Cadastro"/>
<input type='submit' value='enviar'/><br/>
</form><br/>
<a href='/Projeto'>voltar</a>
</body>
</html>