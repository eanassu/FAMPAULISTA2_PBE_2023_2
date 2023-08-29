package br.com.vemprafam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.vemprafam.pojo.Funcionario;

public class DaoFuncionario {
	private String url="jdbc:hsqldb:hsql://localhost/";
    private String user ="SA";
    private String password="";

    private Connection connection;
    public DaoFuncionario() {
    	try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    public void inserir(Funcionario funcionario) {
    	try {
    		String sql = "INSERT INTO FUNCIONARIOS VALUES(?,?,?,?,?)";
    		PreparedStatement pstmt = connection.prepareStatement(sql);
    		pstmt.setInt(1, funcionario.getRe());
    		pstmt.setString(2, funcionario.getNome());
    		pstmt.setString(3, funcionario.getEmail());
    		pstmt.setDate(4, new java.sql.Date(
    				funcionario.getDataNascimento().getTime()));
    		pstmt.setDouble(5, funcionario.getSalario());
    		pstmt.execute();
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    public void excluir(Funcionario funcionario) {
    	try {
    		String sql = "DELETE FROM FUNCIONARIOS WHERE RE=?";
    		PreparedStatement pstmt = connection.prepareStatement(sql);
    		pstmt.setInt(1, funcionario.getRe());
    		pstmt.execute();
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    public void atualizar(Funcionario funcionario) {
    	try {
    		String sql = "UPDATE FUNCIONARIOS SET nome=?,"
    				+ "email=?,dataNascimento=?,salario=? "
    				+ "where re=?";
    		PreparedStatement pstmt = connection.prepareStatement(sql);
    		pstmt.setString(1, funcionario.getNome());
    		pstmt.setString(2, funcionario.getEmail());
    		pstmt.setDate(3, new java.sql.Date(
    				funcionario.getDataNascimento().getTime()));
    		pstmt.setDouble(4, funcionario.getSalario());
    		pstmt.setInt(5, funcionario.getRe());
    		pstmt.execute();
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    public List<Funcionario> getLista() {
    	List<Funcionario> result = new ArrayList<>();
    	try {
    		String sql = "SELECT * FROM FUNCIONARIOS";
    		PreparedStatement pstmt = connection.prepareStatement(sql);
    		ResultSet rs = pstmt.executeQuery();
    		while( rs.next() ) {
    			int re = rs.getInt(1);
    			String nome = rs.getString(2);
    			String email = rs.getString(3);
    			Date dataNascimento = rs.getDate(4);
    			Double salario = rs.getDouble(5);
    			result.add(new Funcionario(re,
    					nome,email,dataNascimento,salario));
    		}
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    	return result;
    }

    public Funcionario buscarPeloRe( int re ) {
    	try {
    		String sql = "SELECT * FROM FUNCIONARIOS WHERE RE=?";
    		PreparedStatement pstmt = connection.prepareStatement(sql);
    		pstmt.setInt(1, re);
    		ResultSet rs = pstmt.executeQuery();
    		if ( rs.next() ) {
    			String nome = rs.getString(2);
    			String email = rs.getString(3);
    			Date dataNascimento = rs.getDate(4);
    			Double salario = rs.getDouble(5);
    			return (new Funcionario(re,
    					nome,email,dataNascimento,salario));
    		}
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    	return null;
    }

    public static void main(String[] args) {
    	DaoFuncionario dao = new DaoFuncionario();
    	Funcionario f =
    		new Funcionario(5,"TESTE","TESTE@TESTE",new Date(),2222);
    	//dao.inserir(f);
    	dao.excluir(f);
	}
 }








