package com.pocpedidos.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Categoria {

	@Id
	private String id;

	private String nome;

	private List<Produto> produtos = new ArrayList<>();

	public Categoria() {
		
	}

	public Categoria(String id, String nome, List<Produto> produtos) {
		super();
		this.id = id;
		this.nome = nome;
		this.produtos = produtos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
