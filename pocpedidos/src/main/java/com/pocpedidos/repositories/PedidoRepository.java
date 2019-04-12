package com.pocpedidos.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pocpedidos.domain.Pedido;

@Repository
public interface PedidoRepository extends MongoRepository<Pedido, String> {

}
