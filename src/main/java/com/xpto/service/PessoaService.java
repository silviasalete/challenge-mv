package com.xpto.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpto.interfaces.IService;
import com.xpto.model.Pessoa;
import com.xpto.repository.RepositoryPessoa;

@Service
public class PessoaService implements IService<Pessoa>{
	
	@Autowired
	private RepositoryPessoa repositoryPessoa;

	@Override
	public List<Pessoa> listar() { 
		return null;
	}

	@Override
	public Optional<Pessoa> listarId(int id) { 
		return repositoryPessoa.findById(id);
	}

	@Override
	public int salvar(Pessoa objeto) { 
		objeto.setDataCadastro(new Date());
		Pessoa pessoa = repositoryPessoa.save(objeto);
		return pessoa.getId();
	}

	@Override
	public int update(Pessoa objeto) { 
		return 0;
	}

	@Override
	public void delete(int id) { 
		
	}

}
