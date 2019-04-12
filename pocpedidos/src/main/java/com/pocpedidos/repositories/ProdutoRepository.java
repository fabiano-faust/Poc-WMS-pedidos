package com.pocpedidos.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pocpedidos.domain.Produto;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {

}
