package br.com.controleConta.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TbConta implements Serializable {

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


	public TbConta() {
	}

	public TbConta(int id, String nomeConta, Date dataCriacao, BigDecimal cnpj, String nomeFantasia, BigDecimal cpf, String nomeCompleto,
			Date dataNascimento, String tipoConta, int contaMae, String status) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
