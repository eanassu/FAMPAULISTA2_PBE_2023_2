package br.com.vemprafam.pojo;

import java.util.Date;

public class Funcionario {
  private int re;
  private String nome;
  private String email;
  private Date dataNascimento;
  private double salario;
@Override
public String toString() {
	return "Funcionario [re=" + re + ", nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento
			+ ", salario=" + salario + "]";
}
public int getRe() {
	return re;
}
public void setRe(int re) {
	this.re = re;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(Date dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public Funcionario(int re, String nome, String email, Date dataNascimento, double salario) {
	super();
	this.re = re;
	this.nome = nome;
	this.email = email;
	this.dataNascimento = dataNascimento;
	this.salario = salario;
}
public Funcionario() {
	super();
	// TODO Auto-generated constructor stub
}
}
