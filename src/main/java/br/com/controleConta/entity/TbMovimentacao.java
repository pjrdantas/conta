package br.com.controleConta.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TbMovimentacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private int idContaDestino;
	private int idContaOrigem;
	private Date dataMovimentacao;
	private int codigoTransacao;
	private int aporte;
	private String descricaoTransacao;
	private BigDecimal debito;
	private BigDecimal credito;
	private BigDecimal saldo;

	public TbMovimentacao() {
	}

	public TbMovimentacao(int id, int idContaDestino, int idContaOrigem, Date dataMovimentacao, int codigoTransacao,
			int aporte, String descricaoTransacao, BigDecimal debito, BigDecimal credito, BigDecimal saldo) {
		super();
		this.id = id;
		this.idContaDestino = idContaDestino;
		this.idContaOrigem = idContaOrigem;
		this.dataMovimentacao = dataMovimentacao;
		this.codigoTransacao = codigoTransacao;
		this.aporte = aporte;
		this.descricaoTransacao = descricaoTransacao;
		this.debito = debito;
		this.credito = credito;
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdContaDestino() {
		return idContaDestino;
	}

	public void setIdContaDestino(int idContaDestino) {
		this.idContaDestino = idContaDestino;
	}

	public int getIdContaOrigem() {
		return idContaOrigem;
	}

	public void setIdContaOrigem(int idContaOrigem) {
		this.idContaOrigem = idContaOrigem;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public int getCodigoTransacao() {
		return codigoTransacao;
	}

	public void setCodigoTransacao(int codigoTransacao) {
		this.codigoTransacao = codigoTransacao;
	}

	public int getAporte() {
		return aporte;
	}

	public void setAporte(int aporte) {
		this.aporte = aporte;
	}

	public String getDescricaoTransacao() {
		return descricaoTransacao;
	}

	public void setDescricaoTransacao(String descricaoTransacao) {
		this.descricaoTransacao = descricaoTransacao;
	}

	public BigDecimal getDebito() {
		return debito;
	}

	public void setDebito(BigDecimal debito) {
		this.debito = debito;
	}

	public BigDecimal getCredito() {
		return credito;
	}

	public void setCredito(BigDecimal credito) {
		this.credito = credito;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
