package com.xpto.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movimentacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer    				 id;

	@ManyToOne(cascade=CascadeType.PERSIST)
	private Pessoa 				 pessoa;
	
	private String  			   tipo; //Pagamento e Recebimento
	private Double  			  valor;

	@ManyToOne(cascade=CascadeType.PERSIST)
	private ContaBancaria contaBancaria;
	
	public Movimentacao() {
		super();
	}	
	
	public Movimentacao(Integer id, Pessoa pessoa, String tipo, Double valor, ContaBancaria contaBancaria) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.tipo = tipo;
		this.valor = valor;
		this.contaBancaria = contaBancaria;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public ContaBancaria getContaBancaria() {
		return contaBancaria;
	}
	public void setContaBancaria(ContaBancaria contaBancaria) {
		this.contaBancaria = contaBancaria;
	}

	@Override
	public String toString() {
		return "Movimentacao [id=" + id + ", pessoa=" + pessoa + ", tipo=" + tipo + ", valor=" + valor
				+ ", contaBancaria=" + contaBancaria + "]";
	}

}
