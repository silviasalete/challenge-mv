package com.xpto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpto.interfaces.IService;
import com.xpto.model.ContaBancaria;
import com.xpto.repository.RepositoryContaBancaria;

@Service
public class ContaBancariaService implements IService<ContaBancaria> {

	@Autowired
	private RepositoryContaBancaria reposytory;

	@Override
	public List<ContaBancaria> listar() { 
		return null;
	}

	@Override
	public Optional<ContaBancaria> listarId(int id) {  
		return reposytory.findById(id);
	}

	@Override
	public int salvar(ContaBancaria objeto) {
		System.out.println("contaBancaria Parametro: "+objeto.toString());
		ContaBancaria contaBancaria = reposytory.save(objeto);
		System.out.println("contaBancaria Retorno: "+contaBancaria.toString());
		return contaBancaria.getId();
	}

	@Override
	public int update(ContaBancaria objeto) { 
		return 0;
	}

	@Override
	public void delete(int id) { 
		
	}
}
