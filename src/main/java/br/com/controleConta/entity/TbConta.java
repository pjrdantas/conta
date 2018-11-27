package br.com.controleConta.entity;

import java.io.Serializable; 

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TbConta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String dataCriacao;
	private String cnpj;
	private String nomeFantasia;
	private String cpf;
	private String nomeCompleto;
	private String dataNascimento;
	private String tipo;
	private String contaMae;
	private String status;
	private String saldo;

	public TbConta() {
	}

	public TbConta(String id, String dataCriacao, String cnpj, String nomeFantasia, String cpf, String nomeCompleto,
			String tipo, String contaMae, String dataNascimento, String status, String saldo) {
		super();
		this.id = id;
		this.dataCriacao = dataCriacao;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cpf;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.tipo = tipo;
		this.contaMae = contaMae;
		this.status = status;
		this.saldo = saldo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getContaMae() {
		return contaMae;
	}

	public void setContaMae(String contaMae) {
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

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

}
