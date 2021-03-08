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
import com.xpto.model.Endereco;
import com.xpto.model.Pessoa;

@Controller
@RequestMapping("/contaBancaria")
public class ControladorContaBancaria {
	
	@Autowired
	private IService<ContaBancaria> service;
	
	@Autowired
	private IService<Pessoa> servicePessoa;


	@GetMapping("/novo/{id}")
	public String novoGet(@PathVariable int id, Model model, ContaBancaria contaBancaria, Pessoa pessoa) {
		Optional<Pessoa> pessoaOptional = servicePessoa.listarId(id);
		System.out.println("pessoa de Optional"+pessoaOptional.get());
		model.addAttribute("pessoa", pessoaOptional.get());
		return "redirect:/cliente/novo/"+pessoaOptional.get().getId()+"#contaBancaria";
	}

	@PostMapping("/novo")
	public String novoPost(Model model, ContaBancaria contaBancaria, Pessoa pessoa, Endereco endereco) {
 
		System.out.println("pessoa CONTROLLER: "+pessoa.toString());
		contaBancaria.setPessoa(pessoa);
		System.out.println("contaBancaria CONTROLLER: "+contaBancaria.toString());
		
		int idPessoa = pessoa.getId();
		int idContaBancaria = contaBancaria.getId();
		System.out.println("idPessoa: "+idPessoa);
		System.out.println("idContaBancaria: "+idContaBancaria);
		service.salvar(contaBancaria);
		
		return "redirect:/cliente/novo/"+idPessoa+"/"+idContaBancaria+"#movimentacao";
	}
}
