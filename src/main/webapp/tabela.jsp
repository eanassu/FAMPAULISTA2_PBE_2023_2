<!DOCTYPE html>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.vemprafam.pojo.Funcionario"%>
<%@page import="java.util.List"%>
<%@page import="br.com.vemprafam.dao.DaoFuncionario"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabela (JSP)</title>
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
<%
DaoFuncionario dao = new DaoFuncionario();
List<Funcionario> lista = dao.getLista();
SimpleDateFormat dateFormat =
     new SimpleDateFormat("dd/MM/yyyy");
NumberFormat currencyFormat =
     NumberFormat.getCurrencyInstance();
for( Funcionario f: lista ) {
	String dataNasc =
			dateFormat.format(f.getDataNascimento());
	String salario = currencyFormat.format(f.getSalario());
%>
<tr>
<td><%=f.getRe() %></td>
<td><%=f.getNome() %></td>
<td><%=f.getEmail() %></td>
<td><%=dataNasc %></td>
<td><%=salario %></td>
</tr>
<%
}
%>
</table>
<a href='/Projeto'>voltar</a>
</body>
</html>





