package br.com.targettrust.locadora.db;



import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.targettrust.locadora.entidades.Carro;
import br.com.targettrust.locadora.excption.CarrojacadastradoException;

public class CarroRepositoryTest {
	private CarroRepository carroRepository = new CarroRepositoryImpl();
	
	@Test
	public void basicInsertTes() throws Exception{
		//arrange
		Carro carro=new Carro();
		carro.setPlaca("III9999");
		//Act
		carroRepository.insertCarro (carro); 
		//Assert
		List <Carro> carros=carroRepository.listCarros();
		boolean encontrou=false;
		for(Carro c : carros) {
			if(c.getPlaca().equals(carro.getPlaca())) {
				carroRepository.delete(carro.getPlaca());
				encontrou = true;
			}
		}
		Assert.assertTrue(encontrou);
	}
	@Test(expected=IllegalArgumentException.class)
	public void carroSemPlacaDeveLancarErro() throws Exception {
		// Arrange
		Carro carro = new Carro();
		// Act
		carroRepository.insertCarro(carro);
		// Assert - assert não é necessário aqui pois esperamos que uma exception seja lançada		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void carroComIdPreenchidoDeveLancarErro() {
		// Arrange
		Carro carro = new Carro();
		carro.setPlaca("III9999");
		carro.setId(5);
		// Act
		carroRepository.insertCarro(carro);
		// Assert - não é necessário		
	}
	
	@Test(expected=CarrojacadastradoException.class)
	public void placaDoCarroExistenteDeveLancarErro() {
		// Arrange
		Carro carro1 = new Carro();
		carro1.setPlaca("III9999");
		carroRepository.insertCarro(carro1);
		Carro carro2 = new Carro();
		carro2.setPlaca(carro1.getPlaca());
		// Act 
		carroRepository.insertCarro(carro2);
	}
	
	public void basicupdateTest() {
		//arrange
		Carro carro=new Carro();
		carro.setPlaca("III9999");
		carroRepository.insertCarro (carro); 
		carro.setId(carroRepositoey.findbyPlaca(carro.getplaca)
				);//todo achar id
		carro.placa(");")
		//Act
		carroRepository.updateCarro (carro); 
		//Assert
		List <Carro> carros=carroRepository.listCarros();
		boolean encontrou=false;
		for(Carro c : carros) {
			if(c.getPlaca().equals(carro.getPlaca())) {
				carroRepository.delete(carro.getPlaca());
				encontrou = true;
			}
		}
		Assert.assertTrue(encontrou);
		}
	}
	
	
		
	

