package com.pocpedidos.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cliente {

	@Id
	private String id;
	
	private String nome;
	
	private String email;
	
	private Endereco endereco;
	
	private List<Pedido> pedidos = new ArrayList();
	
	public Cliente() {
		
	}
	
	public Cliente(String id, String nome, String email, Endereco endereco, List<Pedido> pedidos) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.pedidos = pedidos;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}	
}
