package com.pocpedidos.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pocpedidos.domain.Categoria;

@Repository
public interface CategoriaRepository extends MongoRepository<Categoria, String> {

}
