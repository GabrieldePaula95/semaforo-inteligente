package com.smartcity.semaforo.service;

import com.smartcity.semaforo.model.Semaforo;
import com.smartcity.semaforo.repository.SemaforoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemaforoService {

    @Autowired
    private SemaforoRepository repository;

    public List<Semaforo> getAllSemaforos() {
        return repository.findAll();
    }

    public Optional<Semaforo> getSemaforoById(String id) {
        return repository.findById(id);
    }

    public Semaforo createSemaforo(Semaforo semaforo) {
        return repository.save(semaforo);
    }

    public Semaforo updateSemaforo(String id, Semaforo semaforoAtualizado) {
        return repository.findById(id).map(semaforo -> {
            semaforo.setLocalizacao(semaforoAtualizado.getLocalizacao());
            semaforo.setVeiculoPresente(semaforoAtualizado.isVeiculoPresente());
            semaforo.setTempoVerde(semaforoAtualizado.getTempoVerde());
            return repository.save(semaforo);
        }).orElse(null);
    }

    public void deleteSemaforo(String id) {
        repository.deleteById(id);
    }
}
