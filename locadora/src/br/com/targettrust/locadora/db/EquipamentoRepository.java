package br.com.targettrust.locadora.db;


import java.util.List;

import br.com.targettrust.locadora.entidades.Equipamento;


public interface EquipamentoRepository {
void insert (Equipamento equipamentos);
void update (Equipamento equipamentos);
void delete (Equipamento equipamentos);
List<Equipamento> list();
Equipamento findById(Integer id);
Equipamento findByDescricao(String descricao);

}