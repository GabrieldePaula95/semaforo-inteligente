package com.smartcity.semaforo.repository;

import com.smartcity.semaforo.model.Cruzamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CruzamentoRepository extends MongoRepository<Cruzamento, String> {
}
