package com.xpto.interfaces;

import java.util.List;
import java.util.Optional;

public interface IService<T> {
	public List<T> listar();
	public Optional<T> listarId(int id);
	public int salvar(T objeto);
	public int update(T objeto);
	public void delete(int id);
}
