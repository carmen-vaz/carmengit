package br.com.targettrust.locadora.db;



import java.util.List;

import br.com.targettrust.locadora.entidades.Carro;
import br.com.targettrust.locadora.entidades.Veiculo;

public interface VeiculoRepository {
	
	void insertVeiculo(Veiculo veiculo);
	
	void updateVeiculo(Veiculo veiculo);
	
	List<Veiculo> list();
	
	void delete(String placa);

	Veiculo findByPlaca(String placa);

	void delete(Integer id);

	void update(Veiculo veiculo);
	

}
