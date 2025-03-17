package com.smartcity.semaforo.repository;

import com.smartcity.semaforo.model.Semaforo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemaforoRepository extends MongoRepository<Semaforo, String> {
}
