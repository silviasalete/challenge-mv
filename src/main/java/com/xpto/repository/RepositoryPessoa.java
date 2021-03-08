package com.xpto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.xpto.model.Pessoa;

@Repository
public interface RepositoryPessoa extends CrudRepository<Pessoa, Integer> {

}
