package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank
 * 
 * @author Edmilson Ferreira
 *@version 0.1
 */

public class Cliente implements Serializable {
	
	private String nome;
	private String cpf;
	private String profissao;
	
	//get retorna / set altera
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
