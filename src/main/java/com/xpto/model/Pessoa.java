package com.xpto.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer    						id;

	@OneToOne(cascade = CascadeType.PERSIST)
	private Endereco  				   endereco;

	@OneToMany
	private List<ContaBancaria> contasBancarias;
	
	@OneToMany	
	private List<Movimentacao>    movimentacoes;
	
	private Date  				   dataCadastro;	
	private String        				   nome;
	private String 	  				   telefone;
	private String         					cpf;
	private String        				   cnpj;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(Integer id, Endereco endereco, List<ContaBancaria> contasBancarias, List<Movimentacao> movimentacoes,
			Date dataCadastro, String nome, String telefone, String cpf, String cnpj) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.contasBancarias = contasBancarias;
		this.movimentacoes = movimentacoes;
		this.dataCadastro = dataCadastro;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.cnpj = cnpj;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<ContaBancaria> getContasBancarias() {
		return contasBancarias;
	}
	public void setContasBancarias(List<ContaBancaria> contasBancarias) {
		this.contasBancarias = contasBancarias;
	}
	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}
	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", endereco=" + endereco + ", contasBancarias=" + contasBancarias
				+ ", movimentacoes=" + movimentacoes + ", dataCadastro=" + dataCadastro + ", nome=" + nome
				+ ", telefone=" + telefone + ", cpf=" + cpf + ", cnpj=" + cnpj + "]";
	}
}
