package com.xpto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.xpto.model.ContaBancaria;

@Repository
public interface RepositoryContaBancaria extends CrudRepository<ContaBancaria, Integer> {

}
