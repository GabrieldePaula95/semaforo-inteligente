package com.smartcity.semaforo.service;

import com.smartcity.semaforo.model.Alerta;
import com.smartcity.semaforo.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AlertaService {

    @Autowired
    private AlertaRepository alertaRepository;

    // Criar um alerta
    public Alerta criarAlerta(String message) {
        Alerta alerta = new Alerta(message, LocalDateTime.now());
        return alertaRepository.save(alerta);
    }

    // Buscar todos os alertas
    public List<Alerta> buscarTodos() {
        return alertaRepository.findAll();
    }

    // Buscar um alerta por ID
    public Optional<Alerta> buscarPorId(String id) {
        return alertaRepository.findById(id);
    }

    // Deletar um alerta por ID
    public void deletarAlerta(String id) {
        alertaRepository.deleteById(id);
    }

    //atualizar um alerta
    public Alerta atualizarAlerta(String id, Alerta alerta) {
        alerta.setId(id);
        return alertaRepository.save(alerta);
    }
}
