package br.com.vemprafam.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.vemprafam.dao.DaoFuncionario;
import br.com.vemprafam.pojo.Funcionario;

public class LogicaAlteracao implements Logica {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		int re = Integer.parseInt(request.getParameter("re"));
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		Date dataNascimento = new Date();
		try {
			dataNascimento =
			dateFormat.parse(request.getParameter("dataNascimento"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		double salario =
				Double.parseDouble(request.getParameter("salario"));
		DaoFuncionario dao = new DaoFuncionario();
		Funcionario f = new
				Funcionario(re,nome,email,dataNascimento,salario);
		dao.atualizar(f);
		return "alterado.jsp";
	}

}
