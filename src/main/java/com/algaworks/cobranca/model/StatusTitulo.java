package com.algaworks.cobranca.model;

public enum StatusTitulo {

	PENDENTE, RECEBIDO;

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}