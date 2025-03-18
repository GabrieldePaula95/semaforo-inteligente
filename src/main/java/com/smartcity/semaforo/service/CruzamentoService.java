package com.smartcity.semaforo.service;

import com.smartcity.semaforo.model.Cruzamento;
import com.smartcity.semaforo.repository.CruzamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CruzamentoService {

    @Autowired
    private CruzamentoRepository cruzamentoRepository;

    // Criar um novo cruzamento
    public Cruzamento criarCruzamento(Cruzamento cruzamento) {
        return cruzamentoRepository.save(cruzamento);
    }

    // Buscar todos os cruzamentos
    public List<Cruzamento> buscarTodos() {
        return cruzamentoRepository.findAll();
    }

    // Buscar cruzamento por ID
    public Optional<Cruzamento> buscarPorId(String id) {
        return cruzamentoRepository.findById(id);
    }

    // Deletar cruzamento
    public void deletarCruzamento(String id) {
        cruzamentoRepository.deleteById(id);
    }

    //atualizar um cruzamento
    public Cruzamento atualizarCruzamento(String id, Cruzamento cruzamento) {
        cruzamento.setId(id);
        return cruzamentoRepository.save(cruzamento);
    }
}
