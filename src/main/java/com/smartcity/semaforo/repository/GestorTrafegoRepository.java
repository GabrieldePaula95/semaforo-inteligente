package com.smartcity.semaforo.repository;

import com.smartcity.semaforo.model.GestorTrafego;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestorTrafegoRepository extends MongoRepository<GestorTrafego, String> {
}
