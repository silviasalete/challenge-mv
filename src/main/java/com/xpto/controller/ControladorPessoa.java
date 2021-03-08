package com.xpto.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xpto.interfaces.IService;
import com.xpto.model.ContaBancaria;
import com.xpto.model.Movimentacao;
import com.xpto.model.Pessoa;

@Controller
@RequestMapping("/cliente")
public class ControladorPessoa {

	@Autowired
	private IService<Pessoa> pessoaService;
	
	@Autowired
	private IService<ContaBancaria> contaBancariaService;

	@GetMapping("/novo")
	public String novoGet(Model model, Pessoa pessoa,ContaBancaria contaBancaria, Movimentacao movimentacao) {
		System.out.println("pessoa CLINETE: "+pessoa.toString());
		
		return "cliente/novo";
	}
	
	@GetMapping("/novo/{id}")
	public String novoIdPessoaGet(@PathVariable int id,Model model, Pessoa pessoa,ContaBancaria contaBancaria, Movimentacao movimentacao) {
		System.out.println("ID: "+id);
		System.out.println("pessoa CLINETE: "+pessoa.toString());
		Optional<Pessoa> p =  pessoaService.listarId(id);
		contaBancaria.setPessoa(p.get());
		model.addAttribute("contaBancaria", contaBancaria);
		return "cliente/novo";
	}
	
	@GetMapping("/novo/{id}/{idConta}")
	public String novoIdPessoaIdContaGet(@PathVariable int id,@PathVariable int idConta,Model model, Pessoa pessoa,ContaBancaria contaBancaria, Movimentacao movimentacao) {
		   
		contaBancaria.setPessoa(pessoaService.listarId(id).get());
//		movimentacao.setContaBancaria(contaBancariaService.listarId(idConta).get());
		movimentacao.setPessoa(pessoaService.listarId(id).get());
		System.out.println("movimentacao: "+movimentacao);
		model.addAttribute("movimentacao", movimentacao);
		return "cliente/novo";
	}
	
	@PostMapping("/novo")
	public String novoPost(Model model, Pessoa pessoa) {
		int id = pessoaService.salvar(pessoa);
		return "redirect:/contaBancaria/novo/"+id;
	}
}
