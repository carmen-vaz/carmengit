package br.com.targettrust.locadoura.entidades;

public class Veiculo {
	private String placa;
	private String cor;
	private Integer ano;
	private String marca;
	private String modelo;
	private Equipamento[] equipamentos;
	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @return the equipamentos
	 */
	public Equipamento getEquipamentos() {
		return equipamentos;
	}
	/**
	 * @param equipamentos the equipamentos to set
	 */
	public void setEquipamentos(Equipamento equipamentos) {
		this.equipamentos = equipamentos;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	/**
	 * @return the ano
	 */
	public Integer getAno() {
		return ano;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}