package br.com.targettrust.traccadastros.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_reserva")
public class Reserva extends Entidade{
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name="id_funcionario")
	private Funcionario funcionario;
	@ManyToOne
	@JoinColumn(name="id_veiculo")	
	private Veiculo veiculo;
	
	@Column(name="dt_inicial")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicial;
	
	@Column(name="dt_final")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFinal;
	
	@Column(name="dt_cancelamento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCancelamento;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Date getDataCancelamento() {
		return dataCancelamento;
	}

	public void setDataCancelamento(Date dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}
	
	

}
