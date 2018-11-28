package br.com.controleConta.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Id;

public class TbContaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String nomeConta;
	private Date dataCriacao;
	private BigDecimal cnpj;
	private String nomeFantasia;
	private BigDecimal cpf;
	private String nomeCompleto;
	private Date dataNascimento;
	private String tipoConta;
	private int contaMae;
	private String status;
	private int aporte;
	private int codigoTransacao;
	private String descricaoTransacao;
	private BigDecimal saldo;

	public TbContaDTO() {
	}

	public TbContaDTO(int id, String nomeConta, Date dataCriacao, BigDecimal cnpj, String nomeFantasia, BigDecimal cpf,
			String nomeCompleto, Date dataNascimento, String tipoConta, int contaMae, String status, int aporte, int codigoTransacao,String descricaoTransacao, BigDecimal saldo) {
		super();
		
		this.id = id;
		this.nomeConta = nomeConta;
		this.dataCriacao = dataCriacao;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.tipoConta = tipoConta;
		this.contaMae = contaMae;
		this.status = status;
		this.aporte = aporte;
		this.codigoTransacao = codigoTransacao;
		this.descricaoTransacao = descricaoTransacao;
		this.saldo = saldo;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public BigDecimal getCnpj() {
		return cnpj;
	}

	public void setCnpj(BigDecimal cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public BigDecimal getCpf() {
		return cpf;
	}

	public void setCpf(BigDecimal cpf) {
		this.cpf = cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public int getContaMae() {
		return contaMae;
	}

	public void setContaMae(int contaMae) {
		this.contaMae = contaMae;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAporte() {
		return aporte;
	}

	public void setAporte(int aporte) {
		this.aporte = aporte;
	}

	public int getCodigoTransacao() {
		return codigoTransacao;
	}

	public void setCodigoTransacao(int codigoTransacao) {
		this.codigoTransacao = codigoTransacao;
	}

	public String getDescricaoTransacao() {
		return descricaoTransacao;
	}

	public void setDescricaoTransacao(String descricaoTransacao) {
		this.descricaoTransacao = descricaoTransacao;
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
