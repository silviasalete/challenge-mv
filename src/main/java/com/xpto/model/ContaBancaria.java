package com.xpto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ContaBancaria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int 		id;

	@ManyToOne
	private Pessoa pessoa;
	
	private String agencia;
	private int     numero; 
	private String   banco;
	private String    tipo; 
	
	public ContaBancaria() {
		super();
	}
	
	public ContaBancaria(int id, Pessoa pessoa, String agencia, int numero, String banco, String tipo) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.agencia = agencia;
		this.numero = numero;
		this.banco = banco;
		this.tipo = tipo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [id=" + id + ", pessoa=" + pessoa + ", agencia=" + agencia + ", numero=" + numero
				+ ", banco=" + banco + ", tipo=" + tipo + "]";
	}
}
