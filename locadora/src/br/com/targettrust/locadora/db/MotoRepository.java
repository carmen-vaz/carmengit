package br.com.targettrust.locadora.db;
import java.util.List;

import br.com.targettrust.locadora.entidades.Moto;

public interface MotoRepository {
	void insert (Moto moto);
	void update (Moto moto);
	void delete (Moto moto);
	List<Moto> list();
}



