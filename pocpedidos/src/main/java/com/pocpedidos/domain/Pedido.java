package com.pocpedidos.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pedido {

	@Id
	private String id;
	
	private Date data;
	
	private Cliente user;
	
	private Endereco enderecoEntrega;
	
	private List<Produto> produtos = new ArrayList();

	public Pedido() {	
		
	}
	
	public Pedido(String id, Date data, Cliente user, List<Produto> produtos, Endereco enderecoEntrega) {
		super();
		this.id = id;
		this.data = data;
		this.user = user;
		this.produtos = produtos;
		this.enderecoEntrega = enderecoEntrega;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getUser() {
		return user;
	}

	public void setUser(Cliente user) {
		this.user = user;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Pedido(Endereco enderecoEntrega) {
		super();
		this.enderecoEntrega = enderecoEntrega;
	}
	
}
