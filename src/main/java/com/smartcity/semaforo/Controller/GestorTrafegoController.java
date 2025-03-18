package com.smartcity.semaforo.Controller;

import com.smartcity.semaforo.model.GestorTrafego;
import com.smartcity.semaforo.service.GestorTrafegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gestor_trafego")
public class GestorTrafegoController {

    @Autowired
    private GestorTrafegoService gestorTrafegoService;

    // Criar um novo Gestor de Tráfego
    @PostMapping
    public GestorTrafego criarGestorTrafego(@RequestBody GestorTrafego gestorTrafego) {
        return gestorTrafegoService.criarGestorTrafego(gestorTrafego);
    }

    // Atualizar Gestor de Tráfego por ID
    @PutMapping("/{id}")
    public GestorTrafego atualizarGestorTrafego(@PathVariable String id, @RequestBody GestorTrafego gestorTrafego) {
        return gestorTrafegoService.atualizarGestorTrafego(id, gestorTrafego);
    }

    // Buscar todos os Gestores de Tráfego
    @GetMapping
    public List<GestorTrafego> listarGestoresTrafego() {
        return gestorTrafegoService.buscarTodos();
    }

    // Buscar Gestor de Tráfego por ID
    @GetMapping("/{id}")
    public Optional<GestorTrafego> buscarPorId(@PathVariable String id) {
        return gestorTrafegoService.buscarPorId(id);
    }

    // Deletar Gestor de Tráfego por ID
    @DeleteMapping("/{id}")
    public void deletarGestorTrafego(@PathVariable String id) {
        gestorTrafegoService.deletarGestorTrafego(id);
    }
}
