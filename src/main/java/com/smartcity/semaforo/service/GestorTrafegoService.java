package com.smartcity.semaforo.service;

import com.smartcity.semaforo.model.GestorTrafego;
import com.smartcity.semaforo.repository.GestorTrafegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GestorTrafegoService {

    @Autowired
    private GestorTrafegoRepository gestorTrafegoRepository;

    // Criar um novo Gestor de Tráfego
    public GestorTrafego criarGestorTrafego(GestorTrafego gestorTrafego) {
        return gestorTrafegoRepository.save(gestorTrafego);
    }

    // Buscar todos os Gestores de Tráfego
    public List<GestorTrafego> buscarTodos() {
        return gestorTrafegoRepository.findAll();
    }

    // Buscar Gestor de Tráfego por ID
    public Optional<GestorTrafego> buscarPorId(String id) {
        return gestorTrafegoRepository.findById(id);
    }

    // Deletar Gestor de Tráfego por ID
    public void deletarGestorTrafego(String id) {
        gestorTrafegoRepository.deleteById(id);
    }

    //atualizar um Gestor de Tráfego
    public GestorTrafego atualizarGestorTrafego(String id, GestorTrafego gestorTrafego) {
        gestorTrafego.setId(id);
        return gestorTrafegoRepository.save(gestorTrafego);
    }
}
