package br.com.sysmapaweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estabelecimento")
public class Estabelecimento {
	
	private static final long serialVersionUID = 1L;
	

	@Id
	private Integer codigo;
		
	private String descricao;
	
	private String situacao;	
	
	private Integer numero;
	
	private String logradouro;
	
	private String bairro;
	
	private String cep;
	
	private String estado;
	
	private String cidade;
	
	
	
	public Estabelecimento() {
		super();
	}
	public Estabelecimento(Integer codigo, String descricao, String situacao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.situacao = situacao;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
	

	

}
