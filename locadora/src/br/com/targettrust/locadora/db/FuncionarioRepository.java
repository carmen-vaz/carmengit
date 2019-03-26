package br.com.targettrust.locadora.db;

import java.util.List;

import br.com.targettrust.locadora.entidades.Funcionario;

public interface FuncionarioRepository {
	void insert (Funcionario funcionario);
	void update (Funcionario funcionario);
	void delete (Funcionario funcionario);
	List<Funcionario> list();
}


