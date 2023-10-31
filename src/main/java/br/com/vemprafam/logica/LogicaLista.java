package br.com.vemprafam.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.vemprafam.dao.DaoFuncionario;
import br.com.vemprafam.pojo.Funcionario;

public class LogicaLista implements Logica {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		DaoFuncionario dao = new DaoFuncionario();
		List<Funcionario> funcionarios = dao.getLista();
		request.setAttribute("funcionarios", funcionarios);
		return "listaTaglib.jsp";
	}

}