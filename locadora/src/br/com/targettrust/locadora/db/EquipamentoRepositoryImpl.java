package br.com.targettrust.locadora.db;

import java.sql.Connection;

import br.com.targettrust.locadora.entidades.Carro;

public class EquipamentoRepositoryImpl implements EquipamentoRepository {

@Override
public void insert	(Equipamento equipamentos  {
	try {
		String insert = "INSERT INTO equipamento ("descricao")
				+ "	VALUES (?)";
		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(insert);
		statement.setString(1, equipamento.getdDescricao());
		
		statement.executeUpdate();
		statement.close();
		connection.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	System.out.println("Descri�ao do equipamento " + equipamento.getEquipamento() + "inserido com sucesso");
}

@Override
public void updateEquipamento(Equipamento equipamento) {
	// TODO Auto-generated method stub
	String sql = "UPDATE equipamento SET "
			+ "  descricao = ? "
			+ " WHERE id = ? ";
	try {
		Connection connection = this.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, carro.getPlaca());
		ps.setString(2, carro.getMarca());
		ps.setString(3, carro.getModelo());
		ps.setString(4, carro.getCor());
		ps.setInt(5, carro.getPortas());
		ps.setInt(6,  carro.getAno());
		ps.setInt(7, carro.getId());
		ps.executeUpdate();
		connection.close();
	}
	catch (Exception e) {
		e.printStackTrace();
	}

}

@Override
public List<Equipamento> list() {
	// TODO Auto-generated method stub
	try {
		String sql = "select * from euipamento";
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		List<Equipamento> equipamentos = new ArrayList<>();
		while (resultSet.next()) {
			Equipamento equipamento = new Equipamento();
			// popular
			equipamento.setId(resultSet.getInt("Id"));
			equipamento.setDescricao(resultSet.getString("descricao"));
			equipamento.add(equipamento);
		}
		return equipamento;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return null;
}

@Override
public void delete(Equipamento equipamento) {
	// TODO Auto-generated method stub

}

private Connection getConnection() {
	Connection connection = null;
	try {
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/locadora", "postgres",
				"postgres");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
}

}